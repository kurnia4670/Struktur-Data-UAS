/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Stack;
public class QueueUsingStacks {
    private Stack<Integer> stack1; 
    private Stack<Integer> stack2; 

    
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    
    public void push(int x) {
        stack1.push(x);
    }

    
    public int pop() {
        if (stack2.isEmpty()) {
            
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.pop();
    }

    
    public int peek() {
        if (stack2.isEmpty()) {
            
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.peek();
    }

    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        
        queue.push(1);
        queue.push(2);
        queue.push(3);

       
        System.out.println("Peek: " + queue.peek()); 

        
        System.out.println("Pop: " + queue.pop()); 

        
        System.out.println("Peek: " + queue.peek()); 

        
        System.out.println("Empty: " + queue.empty()); 

        
        queue.pop();
        queue.pop();
        System.out.println("Empty after removing all: " + queue.empty()); 
    }
}
