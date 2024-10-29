package Inventory;

public class Runner {
    public static void main(String[] args) {
        Inventory inventory1 = new Inventory();

        Customer customer1 = new Customer(1,"John Doe", "johndoe@email.com");
        Customer customer2 = new Customer(2,"Max Payne","maxpayne@email.com");
        Customer customer3 = new Customer(3,"Mufasa Leon", "mufasaleon@email.com");

        Product product1 = new Product(1,"Black ops 6", "Game");

        inventory1.addCustomer(customer1);
        inventory1.addCustomer(customer2);
        inventory1.addCustomer(customer3);
        System.out.println(inventory1.toString());

        inventory1.updateCustomer(1,"name","Jordan Short");
        System.out.println(inventory1.toString());

    }
}
