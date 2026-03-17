/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package parkinglist;

/**
 *
 * @author Rostyslav Kuznets
 * Student number: 24326776
 * Course title: BSHCIFSC2
 */
public interface QueueInterface {
    void enqueue(Vehicle element);
    Vehicle dequeue();
    Vehicle front();
    boolean isEmpty();
    int size();
    String display();
}