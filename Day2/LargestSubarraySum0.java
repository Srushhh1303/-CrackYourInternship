import java.util.*;
public class LargestSubarraySum0 {
    static int maxLen(int arr[], int n)
    {
        // Your code here
        int sum=0;
        int len=0;
        HashMap<Integer,Integer> mp=new HashMap<>(); //map-> sum,idx
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(mp.containsKey(sum)){
                len=Math.max(len,j-mp.get(sum));//j-ith idx
            }
            else{
                mp.put(sum,j);
            }
        }

        return len;
    }
    public static void main(String args[]){
       int arr[] = {15,-2,2,-8,1,7,10,23};
       int n = 8;
        System.out.println(maxLen(arr,n));
    }
}
