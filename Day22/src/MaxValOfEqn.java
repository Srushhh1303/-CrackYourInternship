import java.util.*;
public class MaxValOfEqn {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        Deque<int[]> deque = new LinkedList<>();
        int res = Integer.MIN_VALUE;

        for (int[] point : points) {
            int x_j = point[0];
            int y_j = point[1];

            // discard objects that we will never use since too far away
            while (!deque.isEmpty() && x_j - deque.peekFirst()[0] > k)
                deque.pollFirst();


            int sum_j = x_j + y_j;

            if (!deque.isEmpty())
                res = Math.max(res, deque.peekFirst()[1] + sum_j);


            int diff_j = y_j - x_j;

            // discard objects that are inferior (x_i is further than x_j and it's value is smaller)
            while (!deque.isEmpty() &&  diff_j > deque.peekLast()[1])
                deque.pollLast();


            deque.offerLast(new int[]{x_j, diff_j});
        }

        return res;
    }
        public static void main(String[] args) {


    }
}
