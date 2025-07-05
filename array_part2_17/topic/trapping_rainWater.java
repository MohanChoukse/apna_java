package apna_java.array_part2_17.topic;

public class trapping_rainWater {
    /*
     * public static int trappedRainWater(int[] num) {
     * int n = num.length;
     * 
     * // find the left max
     * int[] leftMax = new int[n];
     * leftMax[0] = num[0];
     * for (int i = 1; i < n; i++) {
     * leftMax[i] = Math.max(num[i], leftMax[i - 1]);
     * }
     * 
     * int[] rightMax = new int[n];
     * rightMax[n - 1] = num[n - 1];
     * for (int i = n - 2; i >= 0; i--) {
     * rightMax[i] = Math.max(num[i], rightMax[i + 1]);
     * 
     * }
     * 
     * int trappedWater = 0;
     * for (int i = 0; i < n; i++) {
     * int waterLevel = Math.min(leftMax[i], rightMax[i]);
     * 
     * 
     * trappedWater += waterLevel - num[i];
     * 
     * }
     * 
     * return trappedWater;
     * }
     * 
     * public static int water(int[] num) {
     * int n = num.length;
     * 
     * // left
     * int[] left = new int[n];
     * left[0] = num[0];
     * for (int i = 1; i < n; i++) {
     * left[i] = Math.max(num[i], left[i - 1]);
     * }
     * 
     * // right
     * int[] right = new int[n];
     * right[n - 1] = num[n - 1];
     * for (int i = n - 2; i >= 0; i--) {
     * right[i] = Math.max(num[i], right[i + 1]);
     * }
     * 
     * //tarpping water
     * int trappedWater = 0;
     * for (int i = 0; i < n; i++) {
     * int waterLevel = Math.min(left[i], right[i]);
     * 
     * trappedWater += waterLevel - num[i];
     * }
     * return trappedWater;
     * }
     */

    public static int trappedWater(int[] num) {
        int n = num.length;

        int[] leftMax = new int[n];
        leftMax[0] = num[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], num[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = num[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(num[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - num[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {

        int[] num = { 4, 2, 0, 6, 3, 2, 5 }; // O(n)
        // int[] num = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int[] num = {4, 2, 0, 3, 2, 5};
        System.out.println(trappedWater(num));
        // System.out.println(trappedRainWater(num));
        // System.out.println(water(num));

    }
}
