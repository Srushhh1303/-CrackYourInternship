import java.util.*;
public class TopKfrequenctElement {
    class pair implements Comparable<pair>{
        int num,freq;
        pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
        @Override
        public int compareTo(pair p2){
            return p2.freq-this.freq;  //descending order freq
        }

    }
    public  int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
        }
        int ans[]=new int[k];
        for (int i=0;i<k;i++){
             ans[i]=pq.remove().num;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}
