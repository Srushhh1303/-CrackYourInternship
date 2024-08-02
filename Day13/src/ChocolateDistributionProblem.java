import java.util.*;

 class ChocolateDistributionProblem {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {

        long minDiff=Long.MAX_VALUE;
        // your code here
        Collections.sort(a);
        for(int i=0;i<=n-m;i++){
                int min=a.get(i);
                int max=a.get(i+m-1);
                 long diff=max-min;
                 minDiff=Math.min(minDiff,diff);
        }
        return minDiff;
    }
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);list.add(56);
        list.add(7);list.add(9);list.add(12);

        System.out.println(findMinDiff(list, list.size(), 5));

    }
}
