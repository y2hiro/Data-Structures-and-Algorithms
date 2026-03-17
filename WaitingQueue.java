/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkinglist;

/**
 *
 * @author Rostyslav Kuznets
 * Student number: 24326776
 * Course title: BSHCIFSC2
 */
public class WaitingQueue implements QueueInterface {

    private Node front;
    private Node rear;
    private int size;

    public WaitingQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override     // add vehicle to rear of waiting queue              
    public void enqueue(Vehicle element) {
        Node newNode = new Node(element);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    @Override     // remove next vehicle from front of queue
    public Vehicle dequeue() {
        if (front == null) {
            return null;
        }

        Vehicle removed = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removed;
    }

    @Override
    public Vehicle front() {
        if (front == null) {
            return null;
        }
        return front.data;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String display() {
        if (front == null) {
            return "No vehicles in waiting queue.";
        }

        String result = "";
        Node current = front;
        int count = 1;

        while (current != null) {
            result += count + ". " + current.data.toString() + "\n";
            current = current.next;
            count++;
        }

        return result;
    }
}
