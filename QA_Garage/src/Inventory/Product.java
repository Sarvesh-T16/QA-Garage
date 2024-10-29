package Inventory;

public class Product {
    private int product_id;
    private String name;
    private String category;

    // constructor
    public Product(){}
    public Product(int product_id, String name, String category) {
        this.product_id = product_id;
        this.name = name;
        this.category = category;
    }

    //getters and setters

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
