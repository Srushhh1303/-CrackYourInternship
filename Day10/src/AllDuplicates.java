import java.util.*;
public class AllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int[] a=new int[nums.length];
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            a[nums[i]]++; //idx of nums[i] + 1
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>1){
                list.add(i);
            }
        }

        return list;
    }
    public List<Integer> findDuplicates2(int[] nums) {
        int a[]=new int[nums.length+1];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>1)
            {
                al.add(i);
            }
        }
        return al;
    }
    public static void main(String args[]){

    }
}
