public abstract class Vehicle {
    private int year;
    private String company;
    private int wheels;
    private int id;

    public Vehicle(){};
    public Vehicle(int year, String company, int wheels, int id) {
        this.year = year;
        this.company = company;
        this.wheels = wheels;
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", company='" + company + '\'' +
                ", wheels=" + wheels +
                ", id=" + id +
                '}';
    }

}
