import java.util.*;
public class FindDuplicates {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                return nums[i];
            }
            map.add(nums[i]);
        }
        return -1;
    }
    public static void main(String[] args){

    }
}
