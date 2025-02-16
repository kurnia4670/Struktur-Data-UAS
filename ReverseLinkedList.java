/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}
public class ReverseLinkedList {
   public static ListNode reverseList(ListNode head) {
        ListNode prev = null;    
        ListNode current = head; 
        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev;              
            prev = current;                   
            current = nextNode;               
        }
        return prev; 
    }

    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        
        System.out.print("Original List: ");
        printList(head);

        
        ListNode reversedHead = reverseList(head);

        
        System.out.print("Reversed List: ");
        printList(reversedHead);
    } 
}
