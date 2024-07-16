import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostToHire {
    class Info implements Comparable<Info> {
        int quality, wage;
        double ratio;

        Info(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
            this.ratio = (double) wage / quality;
        }

        @Override
        public int compareTo(Info other) {
            return Double.compare(this.ratio, other.ratio);
        }
    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Info[] workers = new Info[n];

        // Create an array of workers with their quality, wage, and ratio
        for (int i = 0; i < n; i++) {
            workers[i] = new Info(quality[i], wage[i]);
        }

        // Sort workers by their wage-to-quality ratio
        Arrays.sort(workers);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int qualitySum = 0;
        double minCost = Double.MAX_VALUE;

        // Iterate over the sorted workers
        for (Info worker : workers) {
            maxHeap.offer(worker.quality);
            qualitySum += worker.quality;

            // Maintain a heap of size k
            if (maxHeap.size() > k) {
                qualitySum -= maxHeap.poll();
            }

            // When we have k workers, calculate the cost
            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, qualitySum * worker.ratio);
            }
        }

        return minCost;
    }

    public static void main(String args[]){
       int[] quality = {3,1,10,10,1};
        int[] wage = {4,8,2,2,7} ;
        int k = 3;

    }
}
