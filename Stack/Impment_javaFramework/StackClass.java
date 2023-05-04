package Stack.Impment_javaFramework;

import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(2);
        s.push(3);
        s.push(33);
        s.push(3);
        System.out.println(s);
        s.pop();
        s.pop();
        System.out.println(s);
        s.peek();
        s.peek();
        
        System.out.println(s);
        s.search(3);
        System.out.println(s);
        s.set(0, 3);
        System.out.println(s);

        for (int i : s) {
            System.out.print(i + " ");
        }
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
