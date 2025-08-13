package org.oooooomy.skill;

import java.util.HashMap;

/**
 * 169. 多数元素
 */
public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    //最优解 摩尔投票
    //加速当前元素x为众数，下一个元素的值n，x!=n，则正负抵消，众数一定在后边
    public int majorityElement(int[] nums) {
        int ans = 0, vote = 0;
        for (int i : nums) {
            if (vote == 0) ans = i;
            vote += (ans == i ? 1 : -1);
        }
        return ans;
    }


    public int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int max = 0;
        int ans = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }

}
