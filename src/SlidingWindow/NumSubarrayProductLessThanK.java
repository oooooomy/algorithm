package org.oooooomy.SlidingWindow;

/**
 * 713. 乘积小于 K 的子数组
 */
public class NumSubarrayProductLessThanK {

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
            //公式推导
            ans += i - left + 1;
        }

        return ans;
    }

}
