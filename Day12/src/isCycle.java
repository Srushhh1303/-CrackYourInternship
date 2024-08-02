import java.util.*;
public class isCycle {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        //dfs
        boolean[] visited =new boolean[V];

        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
               if( isCycleUtil(adj,visited,i,-1)){
                   return true;
               }
            }
        }
        return false;
    }
    public boolean isCycleUtil(ArrayList<ArrayList<Integer>> adj,boolean visited[],int curr,int parent){
        visited[curr]=true;

        for(int neighbour:adj.get(curr)){ //key are my neighbours
            if(!visited[neighbour]){
                if(isCycleUtil(adj,visited,neighbour,curr)) return true; //key here is my curr and curr is the parent
            }else if(visited[neighbour] && neighbour!=parent){ //i visited node before and it's not my parent -> neighbour!=parent
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){

    }
}
