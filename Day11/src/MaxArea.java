public class MaxArea {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * width;
            maxWater = Math.max(maxWater, area);

            // Move the pointer pointing to the shorter height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
    public static void main(String args[]){
        // Function to return a list containing the DFS traversal of the graph.

    }
}
