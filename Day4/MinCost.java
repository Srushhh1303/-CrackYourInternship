import java.util.Arrays;

public class MinCost {
    //min cost to acquire all coins
    public static int costAcquireCoin(int coins[],int k){
        int cost=0;
        Arrays.sort(coins); //asceding order

        int acquired=coins.length-1;
        int i=0;
        while(acquired>=0){
            cost+=coins[i++]; //bought 1st coin to acquire next 3 coins
            acquired-=k;
        }
        return cost;
    }
    public static void main(String[] args){
      int  coin[] = {1, 2, 5, 10, 20, 50};
      int k = 3;
        System.out.println(costAcquireCoin(coin,k));
    }
}
