package Day14StacksAndQueue;

import com.bridgelabz.*;
public class Queue {
    private Node front, rear;
    private int currentSize;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.currentSize = 0;
    }
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node(data);
        rear.setData(data);
        rear.setNext(null);
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.setNext(rear);
        }
        currentSize++;
        System.out.println(data);
    }
    public static void main(String[] args) {
        Queue list = new Queue();
        System.out.println("Queue list: ");
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
    }
}
