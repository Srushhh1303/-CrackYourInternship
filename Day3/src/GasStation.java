import java.util.ArrayList;
import java.util.Collections;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos=0;
        int sum=0;
        int tot=0;

        for(int i=0;i< gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                tot+=sum;
                sum=0;
                pos=i+1;
            }
        }
        tot+=sum;
        return tot>=0 ? pos :-1;
    }
    public static void main(String args[]){

    }
}
