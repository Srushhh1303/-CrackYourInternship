public class MaxPointsObtainFromCard {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int sum=0;
        int tot=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        // cardPoints = [1,2,3,4,5,6,1], k = 3
        int maxs=sum; //6-3
        for(int i=k-1,j=n-1;i>=0;i--,j--){
            sum-=cardPoints[i];
            int maxEnd=sum+j;
            tot=Math.max(sum,maxEnd);
        }
        return tot;
    }
    public static void main(String[] args){

    }
}
