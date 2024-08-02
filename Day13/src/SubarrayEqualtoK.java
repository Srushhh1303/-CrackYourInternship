import java.util.*;
public class SubarrayEqualtoK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        int curr=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            res+=map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
    public static void main(String[] args){

    }
}
