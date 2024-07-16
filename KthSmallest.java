import java.util.*;
public class KthSmallest {
        public static int kthSmallest(int[][] matrix, int k) {
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            int result=0;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length;j++){
                    pq.add(matrix[i][j]);
                }
            }
            for(int i=0;i<k;i++){
                result=pq.remove();
            }
            return result;
    }
    public static void main(String args[]){
      int[][]  matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }
}
