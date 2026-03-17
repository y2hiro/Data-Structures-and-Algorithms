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

public class CancelledStack implements StackInterface {

    private Node top;
    private int size;

    public CancelledStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(Vehicle element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public Vehicle pop() {
        if (top == null) {
            return null;
        }

        Vehicle removed = top.data;
        top = top.next;
        size--;
        return removed;
    }

    @Override
    public Vehicle top() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String display() {
        if (top == null) {
            return "No cancelled bookings.";
        }

        String result = "";
        Node current = top;
        int count = 1;

        while (current != null) {
            result += count + ". " + current.data.toString() + "\n";
            current = current.next;
            count++;
        }

        return result;
    }
}