import java.util.*;
public class SmallestWindow {
    public static String smallestWindow(String s, String t) {
        int n = s.length();
        if (t.length() > n) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int requiredCount = t.length();
        int i = 0;
        int j = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    requiredCount--;
                }
                map.put(ch, map.get(ch) - 1);
            }

            while (requiredCount == 0) {
                int currWindowSize = j - i + 1;
                if (minWindowSize > currWindowSize) {
                    minWindowSize = currWindowSize;
                    start_i = i;
                }
                char startChar = s.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        requiredCount++;
                    }
                }
                i++;
            }
            j++;
        }

        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + minWindowSize);
    }

    public static void main(String args[]){
        String s= "timetopractice";
        String t="toc";
        System.out.println(smallestWindow(s,t));

    }
}
