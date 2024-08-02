import java.util.*;
public class ConnectingFlight {

         class Edge{
            int src, des, wt;
            Edge(int src,int des, int wt){
                this.src=src;
                this.des=des;
                this.wt=wt;
            }
        }
        static class Info{ //vertex, cost , stops
            int vertex, cost , stops;
            Info( int vertex, int cost , int stops){
                this.vertex=vertex;
                this.cost=cost;
                this.stops=stops;
            }
        }
        public static void createGraph(ArrayList<Edge> graph[],int flight[][]){
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<>();
            }
            for(int i=0;i<flight.length;i++){
                int src=flight[i][0];
                int des=flight[i][1];
                int wt=flight[i][2];

              //  graph[src].add(new Edge(src,des,wt)); //src node 0 is connect by rest of the vetexes
            }
        }

        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            ArrayList<Edge> graph[]=new ArrayList[n];
            createGraph(graph,flights);

            //init dist to store dist to all vertex
            int dist[]=new int[n];
            //init the dist to infinity
            for(int i=0;i<dist.length;i++){
                if(i!=src){
                    dist[i]=Integer.MAX_VALUE;
                }
            }
            //create queue
            Queue<Info> q=new LinkedList<>();
            q.add(new Info(src,0,0));

            while(!q.isEmpty()){
                Info curr=q.remove();

                if (curr.stops > k) continue;

                //relaxation step
                for (Edge e : graph[curr.vertex]) {
                    int newCost = curr.cost + e.wt;
                    if (newCost < dist[e.des]) {
                        dist[e.des] = newCost;
                        q.add(new Info(e.des, newCost, curr.stops + 1));
                    }
                }

            }
            return dist[dst]==Integer.MAX_VALUE ? -1 : dist[dst];
        }

    public static void main(String args[]){

    }

}
