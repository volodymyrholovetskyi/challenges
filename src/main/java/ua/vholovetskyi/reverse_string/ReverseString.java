package ua.vholovetskyi.reverse_string;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {

    public static void main(String[] args) {
        var str = "STRINGS";
        System.out.println(reverseStringUseStringBuilder(str));
        System.out.println(reverseStringUseCharArray(str));
        System.out.println(reverseStringUseStringBuilder2(str));
        System.out.println(reverseStringUseStack(str));
    }

    /**
     * The first way to use StringBuilder
     */
    public static String reverseStringUseStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    /**
     * The second way to use char[]
     */
    public static String reverseStringUseCharArray(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return String.valueOf(chars);
    }

    /**
     * The third way to use StringBuilder 2
     */

    public static String reverseStringUseStringBuilder2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * The fourth way to use Stack
     */
    public static String reverseStringUseStack(String str) {
        Deque<Character> stack = new ArrayDeque<>() {
        };
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
