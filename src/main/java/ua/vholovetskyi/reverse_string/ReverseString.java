package ua.vholovetskyi.reverse_string;

public class ReverseString {

    public static void main(String[] args) {
        var str = "STRINGS";
        System.out.println(reverseStringUseStringBuilder(str));
        System.out.println(reverseStringUseCharArray(str));
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
     * The second way to use char
     */
    public static String reverseStringUseCharArray(String str) {
        char[]chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return String.valueOf(chars);
    }

}
