package Inventory;

import java.util.ArrayList;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public Orders(){};
    public Orders(List<Order> orders) {
        this.orders = orders;
    }
}
