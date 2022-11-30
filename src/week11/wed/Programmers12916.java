package week11.wed;

import java.util.Stack;

public class Programmers12916 {
    public static boolean solution(String s) {
        s.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p'){
                stack.push('p');
            } else if (s.charAt(i)=='y') {
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s1 = "pPoooyY"; //true
        String s2 = "Pyy"; //false
        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }
}
