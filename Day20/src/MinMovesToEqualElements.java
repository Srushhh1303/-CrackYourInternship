import java.util.*;
public class MinMovesToEqualElements {
    public static int minMoves(int arr[]){
        int count=0;
        int mid;
        int n= arr.length;
        Arrays.sort(arr);
        /*if(n%2==0){
             mid=(n/2)+((n/2)-1);
        }else{
            mid=n/2;
        }
        */
         mid=arr[n/2];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<mid){
                count+=Math.abs(arr[mid]-arr[i]);
            }
            if(arr[i]>mid){
               count+=Math.abs(arr[i]-arr[mid]);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={1,2,9,10};
        System.out.println(minMoves(arr));
    }
}
