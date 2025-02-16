/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Stack;
public class ValidParentheses {
    public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        
        for (char c : s.toCharArray()) {
           
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                
                if (stack.isEmpty()) {
                    return false;
                }
                
                
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

       
        return stack.isEmpty();
    }

    
    public static void main(String[] args) {
        
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([{}])";
        String test5 = "([)]";

        
        System.out.println("Test 1: " + isValid(test1)); // Output: true
        System.out.println("Test 2: " + isValid(test2)); // Output: true
        System.out.println("Test 3: " + isValid(test3)); // Output: false
        System.out.println("Test 4: " + isValid(test4)); // Output: true
        System.out.println("Test 5: " + isValid(test5)); // Output: false
    }
}
