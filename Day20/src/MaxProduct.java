import java.util.*;
public class MaxProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int i=nums.length;
        int product1=nums[i-1]*nums[i-2]*nums[i-3];
        int product2=nums[0]*nums[1]*nums[i-1];
        sum=Math.max(product1,product2);
        return sum;
    }
    public static void main(String args[]){

    }
}
