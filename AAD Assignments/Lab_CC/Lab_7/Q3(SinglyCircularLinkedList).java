package Lab_7;

import java.util.*;

public class Q3 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at any given position
    public void insert(int data, int position) {
        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            newNode.next = newNode; // Point to itself to make it circular
            head = newNode;
            print();
            return;
        }

        if (position == 1) {
            // Insert at the beginning
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next; // Find the last node
            }
            newNode.next = head; // New node points to the current head
            head = newNode; // Update head to the new node
            tail.next = head; // Last node points to the new head
            print();
            return;
        }

        // Insert at any other position
        Node temp = head;
        int i; // Declare i here
        for (i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next; // Traverse to the position
        }

        // Check if the position is out of bounds
        if (temp.next == head && i < position - 1) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next; // New node points to the next node
        temp.next = newNode; // Previous node points to the new node
        print();
    }

    // Delete at any given position
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If deleting the head
        if (position == 1) {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next; // Find the last node
            }
            if (head.next == head) { // Single node case
                head = null; // List becomes empty
            } else {
                head = head.next; // Update head to the next node
                tail.next = head; // Last node points to the new head
            }
            print();
            return;
        }

        // Delete at any other position
        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next; // Traverse to the position
        }

        // Check if the position is out of bounds
        if (temp.next == head) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next; // Bypass the node to be deleted
        print();
    }

    // Print the circular linked list
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Q3 cll = new Q3();

        // Insertions
        cll.insert(10, 1);
        cll.insert(20, 2);
        cll.insert(30, 3);
        cll.insert(5, 1); // Insert at the beginning
        cll.insert(25, 3); // Insert in the middle

        // Deletions
        cll.delete(1); // Delete at the beginning
        cll.delete(3); // Delete in the middle
        cll.delete(10); // Invalid position
    }
}