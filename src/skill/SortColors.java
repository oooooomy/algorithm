package org.oooooomy.skill;

/**
 * 75. 颜色分类
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int p0 = 0, p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            nums[i] = 2;
            if (cur <= 1) {
                nums[p0++] = 1;
            }
            if (cur == 0) {
                nums[p1++] = 0;
            }
        }
    }

}
                                                             