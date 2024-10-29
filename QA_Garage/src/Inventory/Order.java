package Inventory;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int order_id;
    private int customer_id;
    private LocalDate order_date;

    private List<Product> productList = new ArrayList<Product>();

    //constructor

    public Order(){};

    //getters and setters

    public int getOrder_id() {
        return order_id;
    }

    public Order(int order_id, int customer_id, LocalDate order_date, List<Product> productList) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.productList = productList;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }


    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", customer_id=" + customer_id +
                ", order_date=" + order_date +
                '}' + productList;
    }
}
