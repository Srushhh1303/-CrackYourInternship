import java.util.*;
public class DFS {
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[]=new boolean[V];
        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i<visited.length;i++){
            if(!visited[i]) {
                dfsOfGraphUtil(adj, i, visited, result);
            }
        }
        return result;
    }
    public static void dfsOfGraphUtil( ArrayList<ArrayList<Integer>> adj, int curr, boolean visited[],  ArrayList<Integer> result){
        result.add(curr);
        visited[curr]=true;

        for(int key : adj.get(curr)){
            if(!visited[key]){
                dfsOfGraphUtil(adj,key,visited,result);
            }
        }
    }

    public static void main(String args[]){
        // Function to return a list containing the DFS traversal of the graph.

    }
}
