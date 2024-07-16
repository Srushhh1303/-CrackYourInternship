import java.util.PriorityQueue;
public class SlidingWindowMax {
        class pair implements Comparable<pair> {
            int i, val;
            pair(int val, int i) {
                this.val = val;
                this.i = i;
            }
            @Override
            public int compareTo(pair p2) {
                return p2.val - this.val; // descending order
            }
        }

        public int[] maxSlidingWindow(int[] nums, int k) {
            int res[] = new int[nums.length - k + 1];
            PriorityQueue<pair> pq = new PriorityQueue<>();

            // Initialize the first window
            for (int i = 0; i < k; i++) {
                pq.add(new pair(nums[i], i));
            }
            res[0] = pq.peek().val;

            for (int i = k; i < nums.length; i++) {
                // Remove elements not within the sliding window range
                while (pq.size() > 0 && pq.peek().i <= (i - k)) {
                    pq.remove();
                }
                // Add the current element
                pq.add(new pair(nums[i], i));
                // The current max element in the sliding window
                res[i - k + 1] = pq.peek().val;
            }
            return res;
        }

    public static void main(String args[]) {

    }
}
