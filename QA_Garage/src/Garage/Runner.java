package Garage;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car(2004,"Ford",4,1,5,true);
        Car car2 = new Car(2004,"Ford",4,4,5,true);
        Motorbike bike1 = new Motorbike(2021,"Yamaha",2,2,350,"Sports");
        Tractor tractor1 = new Tractor(1984,"Rolls Royce",4,3,24.0f,4.0f);

        System.out.println(car1);
        System.out.println(bike1);
        System.out.println(tractor1);

//        List<Garage.Vehicle> vehicleList = new ArrayList<>();
//
//
        Garage garage1 = new Garage();
        garage1.addVehicle(car1);
        garage1.addVehicle(tractor1);
        garage1.addVehicle(bike1);
        garage1.removeVehicle(3);
        garage1.removeType("Garage.Car");
//        garage1.emptyGarage();
        garage1.displayVehicles();
        System.out.println(garage1.calculateBill());
    }
}