import java.util.*;

public class AdjacentPairs {
    public static int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> adjMap = new HashMap<>();
        Set<Integer> uniqueElements = new HashSet<>();

        // Step 1: Build the adjacency map and add elements to the set
        for (int[] pair : adjacentPairs) {
            adjMap.computeIfAbsent(pair[0], x -> new ArrayList<>()).add(pair[1]);
            adjMap.computeIfAbsent(pair[1], x -> new ArrayList<>()).add(pair[0]);
            uniqueElements.add(pair[0]);
            uniqueElements.add(pair[1]);
        }

        // Step 2: Find the start element
        int start = 0;
        for (int key : uniqueElements) {
            if (adjMap.get(key).size() == 1) {
                start = key;
                break;
            }
        }

        // Step 3: Restore the array
        int n = uniqueElements.size();
        int[] result = new int[n];
        Set<Integer> visited = new HashSet<>();
        result[0] = start;
        visited.add(start);

        for (int i = 1; i < n; i++) {
            List<Integer> neighbors = adjMap.get(result[i - 1]);
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    result[i] = neighbor;
                    visited.add(neighbor);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
       int[][] adjacentPairs = {{2,1},{3,4},{3,2}};

       int ans[]=restoreArray(adjacentPairs);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
