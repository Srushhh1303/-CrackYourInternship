import java.util.Collections;
import java.util.PriorityQueue;

public class UglyNum {
    public static int nthUglyNumber(int n) {
        if(n==1) return 1;
        int ugly[]=new int[n];
        ugly[0]=1;
        int i2=0,i3=0,i5=0; //index
        int f2=2,f3=3,f5=5;  //factors
        int count=1;
        for( int i=1;i<n;i++){
           ugly[i]=Math.min(Math.min(f2,f3),f5);

           if(f2==ugly[i]) f2 = 2*ugly[++i2];
            if(f3==ugly[i]) f3= 3*ugly[++i3];
            if (f5==ugly[i]) f5= 5*ugly[++i5];

        }
        return ugly[n-1];
    }

    public static void main(String args[]){
        System.out.println(nthUglyNumber(1325));
    }
}
