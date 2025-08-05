package org.oooooomy.SlidingWindow;

/**
 * 713. 乘积小于 K 的子数组
 */
public class NumSubarrayProductLessThanK {

    public static void main(String[] args) {
        System.out.println(new NumSubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int ans = 0;
        int left = 0;
        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            //公式推导, 随着i右移，固定右端点i的子数组个数
            //不要一直用if判断子数组，例如[10,5,2,6]，[10,5]满足累乘<100，所以子数组
            //i = 0, nums[i] = 10, [10], i - left  + 1= 1, 满足条件的子数组 [10]
            //i = 1, nums[i] = 5, [10, 5], i - left  + 1= 2, 满足条件的子数组 [5] [10, 5]
            //i = 2, nums[i] = 2, [10, 5, 2]不满足条件收缩左边界 -> [5, 2], left++, i - left  + 1= 2, 满足条件的子数组 [2] [5, 2]
            //i = 3, nums[i] = 6, [5, 2, 6],i - left + 1 = 2, 满足条件的子数组 [6] [2, 6] [5, 2, 6]
            ans += i - left + 1;
        }

        return ans;
    }

}
