public class CoinChange {
    public static int ways(int coins[],int change){
        int n= coins.length;
        int dp[][]=new int[n+1][change+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        //base case
       for(int i=1;i<n+1;i++){
           for(int j=1;j<change+1;j++){
                if(j>=coins[i-1]){ //valid : coins value is less than change required
                 //   int include=coins[i]+dp[i-1][change-j];
                 //   int exclude=dp[i-1][j];
                  //  return include+exclude;
                    dp[i][j]=dp[i][j-coins[i-1]] + dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j];//exclude as invalid condition
                }
           }
       }
       return dp[n][change];
    }
    public static void main(String args[]){
        int coins[]={1,2,3};
        int change=4;
        System.out.println(ways(coins,change));
    }
}
