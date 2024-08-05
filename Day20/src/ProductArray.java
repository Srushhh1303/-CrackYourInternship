public class ProductArray {

    public static long[] productExceptSelf(int nums[]) {
        // code here
        long[] result=new long[nums.length];
        long tot=1;
        for(int i=0;i< nums.length;i++){
             tot*=nums[i];
        }
        for(int i=0;i< nums.length;i++){
            result[i]=tot/nums[i];
        }
        return result;
    }
    public static void main(String args[]){

    }
}
