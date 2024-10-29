package Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public Garage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;

    }

    public Garage() {
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println("Garage.Vehicle added "+vehicle);

    }

    public void removeVehicle(int id){ //Removes by id
        for (Vehicle vehicle: vehicles){
            if (vehicle.getId()==id) {
                vehicles.remove(vehicle);
            }

        }
    }

    public void removeType(String type) {
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getClass().getName() == type){ //Checking class type of vehicle and comparing to type argument
                vehicles.remove(vehicle);
            }
        }
    }

    public void displayVehicles(){
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }

    public void emptyGarage(){
        vehicles.clear();
    }

    public double calculateBill(){
        double bill = 0;
        for (Vehicle vehicle: vehicles){
            switch (vehicle.getClass().getName()){
                case "Garage.Car":
                    bill+=100;
                    break;
                case "Garage.Motorbike":
                    bill+=50;
                    break;
                case "Garage.Tractor":
                    bill+=200;
                    break;
                }
            }
        return bill;
    }
}
