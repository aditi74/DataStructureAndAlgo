package LeetCode;

/**
 * Created by vikram on 5/3/17.
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class TrappingRainWater {

    public static void main(String[] args) {

    }
    public int trap(int[] height) {
        if (height.length == 0)
            return 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];


        left[0] = height[0];
        right[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(height[i], left[i - 1]);

        }

        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);

        }

        int waterSaved = 0;
        for (int i = 0; i < height.length; i++) {
            waterSaved += (Math.min(left[i], right[i]) - height[i]);

        }

        return waterSaved;
    }
    }
