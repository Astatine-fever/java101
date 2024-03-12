package Chapters.C21_Java_Collections;

// Each box in the chain
class Node {
    int data; // Number stored in the box
    Node next; // The next box in the chain

    Node(int data) {
        this.data = data;
    }
}

// The chain of boxes
class LinkedList {
    Node head; // The first box in the chain

    void addAtBeginning(int data) {
        Node newNode = new Node(data); // Make a new box with the number
        newNode.next = head; // Connect the new box to the current chain
        head = newNode; // The new box becomes the first one
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " "); // Print the number in the box
            current = current.next; // Move to the next box
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Make a chain of boxes

        list.addAtBeginning(3); // Put 3 in the first box
        list.addAtBeginning(5); // Put 5 in a new box and connect it to the first box
        list.addAtBeginning(7); // Put 7 in a new box and connect it to the first box

        list.display(); // Show the numbers in the chain
    }
}
