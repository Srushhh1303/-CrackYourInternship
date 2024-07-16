import java.util.PriorityQueue;

public class MinRefuelStop {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int stop=0;
        int currFuel=startFuel;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> b - a); //pos , fuel
        int i=0;
        while(currFuel<target){
            while(i<stations.length && stations[i][0]<=currFuel ){
                pq.add(stations[i][1]);
                i++;
            }
           if(pq.isEmpty()){
               return -1;
           }
           currFuel+=pq.remove();
           stop++;
        }
        return stop;

    }
    public static void main(String args[]){

    }
}
