import java.util.*;
public class findPairDifference {
    public static int findPair(int n, int x, int[] arr) {
        int low=0;int high=n-1;
        Arrays.sort(arr);
        while(low<high){
            int diff=arr[high]-arr[low];
            if(diff==x){
                return 1;
            }else if(diff>x){
                high--;
            }else low++;
        }
        return -1;
    }
    public static void main(String args[]){

    }
}
