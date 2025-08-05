package org.oooooomy.SlidingWindow;

import java.util.*;

/**
 * 438. 找到字符串中所有字母异位词
 */
public class FindAnagrams {

    public static void main(String[] args) {
        System.out.println(new FindAnagrams().findAnagrams("cbaebabacd", "abc"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] sHash = new int[26];
        int[] pHash = new int[26];
        int left;
        for (char c : p.toCharArray()) {
            pHash[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sHash[s.charAt(i) - 'a']++;
            left = i - p.length() + 1;
            if (left < 0) {
                continue;
            }
            if (Arrays.equals(sHash, pHash)) {
                ans.add(left);
            }
            sHash[s.charAt(left) - 'a']--;
        }

        return ans;
    }

    //错误做法
//    public List<Integer> findAnagrams2(String s, String p) {
//        List<Integer> ans = new ArrayList<>();
//        char[] sArr = s.toCharArray();
//        char[] pArr = p.toCharArray();
//        Set<Character> set = new HashSet<>();
//        for (char c : pArr) {
//            set.add(c);
//        }
//        for (int i = 0; i < sArr.length - pArr.length; i++) {
//            int count = 0;
//            for (int j = i; j < i + pArr.length; j++) {
//                //错误三个重复单一字符也算了 p=abc bab
//                if (!set.contains(sArr[j])) {
//                    break;
//                } else {
//                    count++;
//                }
//            }
//            if (count == pArr.length) {
//                ans.add(i);
//            }
//        }
//        return ans;
//    }

}
