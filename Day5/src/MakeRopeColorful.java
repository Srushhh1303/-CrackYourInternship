import java.util.*;

public class MakeRopeColorful {
    public static int minCost(String colors, int[] neededTime) {
        int minCost = 0;

        // Traverse through the string and compare adjacent characters
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                // If adjacent characters are the same, add the smaller needed time to the minCost
                if (neededTime[i] < neededTime[i - 1]) {
                    minCost += neededTime[i];
                } else {
                    minCost += neededTime[i - 1];
                    // Update neededTime[i] to the larger value to keep the current one for further comparison
                    neededTime[i] = neededTime[i - 1];
                }
            }
        }

        return minCost;
    }

    public static void main(String args[]){
        String colors = "aabaa";
        int neededTime[] = {1,2,3,4,1};
        System.out.println(minCost(colors,neededTime));
    }
}
