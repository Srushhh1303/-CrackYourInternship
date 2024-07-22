import java.util.Arrays;

public class NonOverlappingInterval {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int toremove=0;
        int lastEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastEnd){
                toremove++;
            }else {
                lastEnd = intervals[i][1];
            }
        }
        return toremove;
    }
    public static void main(String args[]){
       int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }

}
