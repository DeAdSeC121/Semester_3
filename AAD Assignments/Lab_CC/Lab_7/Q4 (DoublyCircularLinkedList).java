package Lab_7;

public class Q4 {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Insert at any given position
    public void insert(int data, int position) {
        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            head = tail = newNode; // Set head and tail to the new node
            print();
            return;
        }

        // Insert at the beginning
        if (position == 1) {
            newNode.next = head; // New node points to the current head
            head.prev = newNode; // Current head's previous points to the new node
            head = newNode; // Update head to the new node
            print();
            return;
        }

        // Traverse to the desired position
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next; // Move to the next node
        }

        // Check if the position is out of bounds
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert at the end
        if (temp == tail) {
            tail.next = newNode; // Current tail's next points to the new node
            newNode.prev = tail; // New node's previous points to the current tail
            tail = newNode; // Update tail to the new node
        } else {
            // Insert in the middle
            newNode.next = temp.next; // New node points to the next node
            newNode.prev = temp; // New node's previous points to the current node
            if (temp.next != null) {
                temp.next.prev = newNode; // Next node's previous points to the new node
            }
            temp.next = newNode; // Current node's next points to the new node
        }
        print();
    }

    // Delete at any given position
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete at the beginning
        if (position == 1) {
            if (head == tail) {
                head = tail = null; // Single node case
            } else {
                head = head.next; // Update head to the next node
                head.prev = null; // New head's previous is null
            }
            print();
            return;
        }

        // Traverse to the desired position
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next; // Move to the next node
        }

        // Check if the position is out of bounds
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Delete at the end
        if (temp == tail) {
            tail = tail.prev; // Update tail to the previous node
            tail.next = null; // Set new tail's next to null
        } else {
            // Delete in the middle
            temp.prev.next = temp.next; // Bypass the node to be deleted
            if (temp.next != null) {
                temp.next.prev = temp.prev; // Update the next node's previous
            }
        }
        print();
    }

    // Print the doubly linked list
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next; // Move to the next node
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Q4 dll = new Q4();

        // Insertions
        dll.insert(10, 1);
        dll.insert(20, 2);
        dll.insert(30, 3);
        dll.insert(5, 1);  // Insert at the beginning
        dll.insert(25, 3); // Insert in the middle

        // Deletions
        dll.delete(1); // Delete at the beginning
        dll.delete(3); // Delete in the middle
    }
    }