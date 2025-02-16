/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
public class RemoveNodeFromDoublyLinkedList {
    public static DoublyListNode removeElements(DoublyListNode head, int val) {
        DoublyListNode current = head;

        while (current != null) {
           
            if (current.val == val) {
                
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }

        return head;
    }

    
    public static void printList(DoublyListNode head) {
        DoublyListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        DoublyListNode head = new DoublyListNode(1);
        head.next = new DoublyListNode(2);
        head.next.prev = head;
        head.next.next = new DoublyListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyListNode(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DoublyListNode(3);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new DoublyListNode(5);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        
        System.out.print("Original List: ");
        printList(head);

        
        head = removeElements(head, 3);

        
        System.out.print("Modified List: ");
        printList(head);
    }
}
