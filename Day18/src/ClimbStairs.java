public class ClimbStairs {
    public int climbStairs(int n) { //memoisation
        int dp[]=new int[n+1];

        int ans=dpMemoisation(n,dp);
        return ans;
    }
    //using dp
    public int dpMemoisation(int n,int dp[]){
        //initialisation
        if(n==1 || n==2 || n==0) return n;
        //storage
        if(dp[n]!=0){ //it's already calculated
            //using that storage
            return dp[n];
        }
        dp[n]=dpMemoisation(n-1,dp)+dpMemoisation(n-2,dp);
        return dp[n];
    }
    public static void main(String args[]){

    }
}
