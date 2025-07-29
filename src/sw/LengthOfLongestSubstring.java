package org.oooooomy.sw;

import java.util.*;

/**
 * 3. 无重复字符的最长子串
 * abcabcbb
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
//        int len = s.length();
//        if (len == 0) {
//            return 0;
//        }
//        char[] chars = s.toCharArray();
//        int ans = 0;
//        int left = 0;
//        int[] arr = new int[128];
//        for (int right = 0; right < len; right++) {
//            if (arr[chars[right]] > 0) {
//                //避免前边也有重复的，所以取最大值
//                left = Math.max(left, arr[chars[right]] + 1);
//            }
//            arr[chars[right]] = right;
//            ans = Math.max(ans, right - left + 1);
//        }
//        return ans;

        if (s.isEmpty()) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }

}
