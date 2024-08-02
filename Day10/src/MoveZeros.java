public class MoveZeros {
    public static  void moveZeroes(int[] nums) {
        int j = 0; // Tracking the position to place the next non-zero element

        // First pass: Move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        // Second pass: Fill the rest of the array with zeroes
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    //using snowball analogy
    public void moveZeroes2(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }
    }

    public static void main(String[] args){

    }
}
