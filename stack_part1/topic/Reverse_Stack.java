package apna_java.stack_part1.topic;

import java.util.Stack;

public class Reverse_Stack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reStack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom(s, 4);
        reStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
