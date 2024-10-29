package Inventory;

public class Customer {
    private int customer_id;
    private String name;
    private String email;

    // constructors
    public Customer (){}

    public Customer(int customer_id, String name, String email) {
        this.customer_id = customer_id;
        this.name = name;
        this.email = email;
    }

    //getters and setters

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
