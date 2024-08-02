import java.util.*;
public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result=new ArrayList<>();
        // Code here
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[V];
        q.add(0); //adding current 0th index

        while(!q.isEmpty()){

            int curr=q.remove();
            result.add(curr);
            visited[curr]=true;

            for(int key : adj.get(curr)){
                if(!visited[key]){
                    q.add(key);
                    visited[key]=true;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){

    }
}
