package org.oooooomy.stack;

import java.util.*;

/**
 * 20. 有效的括号
 */
public class IsValid {

    //()[]{} 40,41,91,93,123,125
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
//        HashMap<Character, Character> map = new HashMap<>() {
//            {
//                put('(', ')');
//                put('[', ']');
//                put('{', '}');
//            }
//        };

//        for (Character c : s.toCharArray()) {
//            if (map.containsKey(c)) {
//                stack.push(c);
//            } else if (stack.pop() != map.get(c)) {
//
//            }
//        }

        //为什么这样写，因为右括号需要匹配对应的左括号，所以要为key
        //而左括号只需要判断为左括号即可放入栈中
        HashMap<Character, Character> map = new HashMap<>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || map.get(c) != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
