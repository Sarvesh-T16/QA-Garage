public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car(2004,"Ford",4,1,5,true);
        Motorbike bike1 = new Motorbike(2021,"Yamaha",2,2,350,"Sports");
        Tractor tractor1 = new Tractor(1984,"Rolls Royce",4,3,24.0f,4.0f);

        System.out.println(car1);
        System.out.println(bike1);
        System.out.println(tractor1);

    }
}
