package org.oooooomy.SlidingWindow;

/**
 * 209. 长度最小的子数组
 */
public class MinSubArrayLen {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(new MinSubArrayLen().minSubArrayLen(7, arr));
    }

    public int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                min = Math.min(min, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
