public class Motorbike extends Vehicle{
    private int cc;
    private String bikeType;

    public Motorbike(int year, String company, int wheels, int id, int cc, String bikeType) {
        super(year, company, wheels, id);
        this.cc = cc;
        this.bikeType = bikeType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public String toString() {
        return "motorbike{" +
                "cc=" + cc +
                ", bikeType='" + bikeType + '\'' +
                "} " + super.toString();
    }
}
