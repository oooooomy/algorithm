package org.oooooomy.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        int i = new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb");
        System.out.println(i);
    }

    //s = "abcabcbb"
    //这道题主要用到思路是：滑动窗口
    //
    //什么是滑动窗口？
    //
    //其实就是一个队列,比如例题中的 abcabcbb，进入这个队列（窗口）为 abc 满足题目要求，当再进入 a，队列变成了 abca，这时候不满足要求。所以，我们要移动这个队列！
    //
    //如何移动？
    //
    //我们只要把队列的左边的元素移出就行了，直到满足题目要求！
    //
    //一直维持这样的队列，找出队列出现最长的长度时候，求出解！
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        char c;
        for (int i = 0; i < chars.length; i++) {
            c = chars[i];
            if (map.containsKey(c)) {

                //为什么不是left++，因为与右指针重复的值不一定就在左指针
                //例如"baca"时，“a”出现重复，left应该指向“c”而不是left++
                //left++;

                //为什么是left和map.get(c) + 1的最大值，而不是map.get(c) + 1?

                //保证left是往右边移动的
                //left 表示当前无重复子串的起始位置！！！！！！
                // left < map.get(c) + 1, left指针的左边没有出现过c
                // left > map.get(c) + 1, left指针的左边没有已经出现过c，且map.get(c)是之前的索引，left = map.get(c) + 1会导致又退回去
                left = Math.max(left, map.get(c) + 1);

            }
            map.put(c, i);
            ans = Math.max(ans, i - left + 1);
        }

        return ans;
    }

}
