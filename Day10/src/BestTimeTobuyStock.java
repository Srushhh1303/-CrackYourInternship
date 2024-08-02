public class BestTimeTobuyStock {

    public static int maxProfit(int[] arr) {
        int profit=0;
        int bp=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(bp<arr[i]){
                profit=Math.max(profit,arr[i]-bp);
            }
            else{
                bp=arr[i];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
