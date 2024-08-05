import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;

public class PermutateArrayEqualtoK {

    static boolean isPossible(Integer a[], int b[],
                              int n, int k)
    {
        // Sort the array a[] in decreasing order.
        Arrays.sort(a, Collections.reverseOrder());

        // Sort the array b[] in increasing order.
        Arrays.sort(b);

        // Checking condition on each index.
        for (int i = 0; i < n; i++)
            if (a[i] + b[i] < k)
                return false;

        return true;
    }
    public static void main(String args[]){
        Integer a[] = {2, 1, 3};
        int b[] = { 7, 8, 9 };
        int k=10;
        System.out.println(isPossible(a,b,a.length,k));
    }
}
