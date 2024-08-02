import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] result = new int[2];

        Arrays.sort(nums);  // Ensure the array is sorted

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                result[0] = left;
                result[1] = right;
                break;  // If you only need the first pair, you can break here
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
    public static void main(String args[]){

    }
}
