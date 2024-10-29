public class Car extends Vehicle{

    private int doors;
    private boolean tint;


    public Car(int year, String company, int wheels, int id, int doors, boolean tint) {
        super(year, company, wheels, id);
        this.doors = doors;
        this.tint = tint;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isTint() {
        return tint;
    }

    public void setTint(boolean tint) {
        this.tint = tint;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", tint=" + tint +
                "} " + super.toString();
    }
}
