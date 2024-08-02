import java.util.*;
public class isCycleDirected {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here dfs
        boolean[] visited =new boolean[V];
        boolean[] stack =new boolean[V];

        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                if( isCycleUtil(adj,visited,stack,i)){
                    return true;
                }
            }
        }
        return false;

    }
    boolean isCycleUtil( ArrayList<ArrayList<Integer>> adj, boolean[] visited,  boolean[] stack,int curr){
        visited[curr]=true;
        stack[curr]=true;

        for(int neigh: adj.get(curr)){
            if(stack[neigh]) return true;

            if(!visited[neigh] && isCycleUtil(adj,visited,stack,neigh) ){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }

    public static void main(String[] args){

    }
}
