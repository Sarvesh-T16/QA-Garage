package Garage;

public class Tractor extends Vehicle{

    private float tyreSize;
    private float maxLoad;

    public Tractor(int year, String company, int wheels, int id, float tyreSize, float maxLoad) {
        super(year, company, wheels, id);
        this.tyreSize = tyreSize;
        this.maxLoad = maxLoad;
    }

    public float getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(float tyreSize) {
        this.tyreSize = tyreSize;
    }

    public float getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(float maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Garage.Tractor{" +
                "tyreSize=" + tyreSize +
                ", maxLoad=" + maxLoad +
                "} " + super.toString();
    }
}
