import java.util.*;
public class TopologicalSort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        boolean visited[]=new boolean[V];
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[V];

        for(int i=0;i<V;i++){
            if(!visited[i]){
                topoSortUtil( adj,  visited, s,i);
            }
        }
        int i=0;
        while(!s.isEmpty()){
            ans[i++]=s.pop();
        }
        return ans;
    }
    static void topoSortUtil(ArrayList<ArrayList<Integer>> adj, boolean visited[], Stack<Integer> s,int curr){
        visited[curr]=true;

        //dfs
        for(int neigh : adj.get(curr)){
            if(!visited[neigh]) {
                topoSortUtil( adj,  visited, s,neigh);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args){

    }
}

