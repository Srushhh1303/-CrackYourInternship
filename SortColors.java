public class SortColors {

        public void sortColors(int[] nums) {
            int n=nums.length;
            int low=0;
            int mid=0;
            int high=n-1;

            while(mid<=high){
                if(nums[mid]==0){
                    int temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;
                    mid++;
                    low++;
                }
                else if(nums[mid]==2){
                    int temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;

                }
                else{
                    mid++;
                }
            }
        }
    public static void main(String[] args){

    }
}
