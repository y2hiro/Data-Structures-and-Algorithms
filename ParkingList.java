/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkinglist;

/**
 *
 * @author Rostyslav Kuznets
 * Student number: 24326776
 * Course title: BSHCIFSC2
 */
public class ParkingList implements LinearListInterface {

    private Node head;
    private int size;

    public ParkingList() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override      //add vehicle to the end of active booking list
    public void add(Vehicle element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    @Override       //remove booking by mathicng registration number
    public boolean removeByRegistration(String registrationNumber) {
        if (head == null) {
            return false;
        }

        if (head.data.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public Vehicle searchByRegistration(String registrationNumber) {
        Node current = head;

        while (current != null) {
            if (current.data.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
                return current.data;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public boolean updateZone(String registrationNumber, String newZone) {
        Vehicle vehicle = searchByRegistration(registrationNumber);
        if (vehicle != null) {
            vehicle.setZone(newZone);
            return true;
        }
        return false;
    }

    @Override
    public String display() {
        if (head == null) {
            return "No active parking bookings.";
        }

        String result = "";
        Node current = head;
        int count = 1;

        while (current != null) {
            result += count + ". " + current.data.toString() + "\n";
            current = current.next;
            count++;
        }

        return result;
    }
}
