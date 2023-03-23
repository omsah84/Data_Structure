package Stack.Impment_javaFramework;

import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(2);
        s.push(3);
        s.push(33);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
