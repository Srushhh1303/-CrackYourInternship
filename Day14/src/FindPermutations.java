import java.util.*;

public class FindPermutations {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean fre[]=new boolean[arr.size()];

        findPath(arr , result,ds,fre);

        return result;
    }
    static void  findPath(ArrayList<Integer> arr ,   ArrayList<ArrayList<Integer>> result,List<Integer> ds, boolean fre[]){
        //base case
        if(ds.size()== arr.size()){
            result.add(new ArrayList<>(ds));
            return;
        }
        //recursion
        for(int i=0;i< arr.size();i++){

            if(!fre[i]){
                fre[i]=true;
                ds.add(arr.get(i));
                findPath(arr,result,ds,fre);
                //backtrack step
                ds.remove(ds.size()-1);
                fre[i]=false;
            }
        }
    }
    public static void find(String str,String ans){
            if(str.length()==0){
                System.out.println(ans);
                return;
            }
            for(int i=0;i<str.length();i++){
                char curr=str.charAt(i);
                str=str.substring(0,i)+str.substring(i+1);
                find(str,ans+curr);
            }
    }
    public static void main(String[] args){

    }
}
