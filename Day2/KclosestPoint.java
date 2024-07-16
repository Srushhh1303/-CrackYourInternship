import java.util.*;
public class KclosestPoint {
    static class pair implements Comparable<pair>{
        int x,y;
        int d;
        pair(int x,int y,int d){
            this.x=x;
            this.y=y;
            this.d=d;

        }
        @Override
        public int compareTo(pair p2){
            return p2.d-this.d; //max heap
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        int ans[][]=new int[k][2];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
                int x=points[i][0];
                int y=points[i][1];
                int d=(x*x)+(y*y);
                pq.add(new pair(x,y,d));
                if(pq.size()>k){
                    pq.remove();
                }
        }
        for(int i=0;i<k;i++){
            pair remove=pq.remove();
            ans[i][0]=remove.x;
            ans[i][1]=remove.y;
        }
        return ans;
    }
    public static void main(String args[]){
        int[][] points = { {1, 3}, {-2, 2} };
        int[][] ans = kClosest(points, 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println("[" + ans[i][0] + ", " + ans[i][1] + "]");
        }
    }
    }

