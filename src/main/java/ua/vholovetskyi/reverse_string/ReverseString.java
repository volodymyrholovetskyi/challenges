package ua.vholovetskyi.reverse_string;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ReverseString {

    public static void main(String[] args) {
        var str = "STRINGS";
        System.out.println(reverseStringUseStringBuilder(str));
        System.out.println(reverseStringUseCharArray(str));
        System.out.println(reverseStringUseStringBuilder2(str));
        System.out.println(reverseStringUseStack(str));
        System.out.println(reverseStringUseRecursion(str));
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 3, 5, 8})));
    }

    /**
     * The first way is the use StringBuilder
     */
    public static String reverseStringUseStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    /**
     * The second way is the use char[]
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
     * The third way is the use StringBuilder 2
     */

    public static String reverseStringUseStringBuilder2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * The fourth way is the use of Stack
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

    /**
     * The fifth method is the use of recursion
     */
    public static String reverseStringUseRecursion(String str) {
        //The base rule will return a string if the length of the string is less than or equal to one
        if (str.length() <= 1) {
          return str;
        }
        return reverseStringUseRecursion(str.substring(1)) + str.charAt(0);
    }

    /**
     * The sixth method is the use of recursion
     */
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
