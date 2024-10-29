package Inventory;
import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Customer> customerList = new ArrayList<Customer>();
    private List<Product> productList = new ArrayList<Product>();

    public Inventory(){}

    public Inventory(List<Customer> customerList, List<Product> productList) {
        this.customerList = customerList;
        this.productList = productList;
    }

    //Add Customer and Product
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void addProduct(Product product){
        productList.add(product);
    }

    //Remove Customer and Product
    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
    public void removeProduct(Product product){
        productList.remove(product);
    }

    //Update Customer and Product
    public void updateCustomer(int id, String field, String updatedValue) {
        for (Customer customer: customerList){
            if (customer.getCustomer_id() == id){
                switch(field){
                    case("name"):
                        customer.setName(updatedValue);
                        break;

                    case("email"):
                        customer.setEmail(updatedValue);
                        break;

                    default:
                        System.out.println("Field entered is not valid!");
                        break;
                }
            }
        }
    }

    public void updateProduct(int id, String field, String updatedValue) {
        for (Product product: productList){
            if (product.getProduct_id() == id){
                switch(field){
                    case("name"):
                        product.setName(updatedValue);
                        break;

                    case("email"):
                        product.setCategory(updatedValue);
                        break;

                    default:
                        System.out.println("Field entered is not valid!");
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "customerList=" + customerList +
                ", productList=" + productList +
                '}';
    }
}
