import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] arr) {
        if (arr == null || arr.length < 3) return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;

        for(int i=0;i<n-2;i++){
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    res.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }

            }

        }
        return res;
    }
    public static void main(String args[]){

    }
}
