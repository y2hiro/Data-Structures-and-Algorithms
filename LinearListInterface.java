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
public interface LinearListInterface {
    boolean isEmpty();
    int size();
    void add(Vehicle element);
    boolean removeByRegistration(String registrationNumber);
    Vehicle searchByRegistration(String registrationNumber);
    String display();
    boolean updateZone(String registrationNumber, String newZone);
}
