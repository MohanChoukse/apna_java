package apna_java.stack_part1.topic;

import java.util.Stack;

public class reverse_string {

    public static String reString(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char a = s.pop();
            result.append(a);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String a = reString(str);
        System.out.println(a);
    }
}
