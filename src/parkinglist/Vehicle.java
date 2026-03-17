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
public class Vehicle {
    protected String registrationNumber;
    protected String ownerName;
    protected String zone;
    protected String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String zone, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.zone = zone;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getZone() {
        return zone;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Reg: " + registrationNumber +
               ", Owner: " + ownerName +
               ", Zone: " + zone +
               ", Type: " + vehicleType;
    }

}
