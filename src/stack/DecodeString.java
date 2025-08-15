package org.oooooomy.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DecodeString {

    public String decodeString(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            }
        }

    }

}
