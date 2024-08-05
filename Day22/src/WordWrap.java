import java.util.*;
public class WordWrap {
    static int solve(int[]nums,int k,int i,int sum,int[][]dp){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }
        //same line
        int a=Integer.MAX_VALUE;
        if((sum+nums[i]+1)-1<=k){
            a=solve(nums,k,i+1,sum+nums[i]+1,dp);
        }
        //new line
        int b=(k-sum+1)*(k-sum+1)+solve(nums,k,i+1,nums[i]+1,dp);
        return dp[i][sum]=Math.min(a,b);
    }
    public int solveWordWrap (int[] nums, int k)
    {
        // Code here
        int n=nums.length;
        int[][]dp=new int[n][k+2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,k,0,0,dp);
    }
    public static void main(String args[]){

    }
}
