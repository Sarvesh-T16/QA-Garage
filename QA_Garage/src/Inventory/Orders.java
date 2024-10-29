package Inventory;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Orders {

    private List<Order> orders = new ArrayList<Order>();

    public Orders(){};
    public Orders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }

    public void updateOrders(int id, String field, String updatedValue) {
        for (Order order: orders){
            if (order.getOrder_id() == id){
                switch(field){
                    case("order_id"):
                        order.setOrder_id(Integer.parseInt(updatedValue));
                        break;

                    case("customer_id"):
                        order.setCustomer_id(Integer.parseInt(updatedValue));
                        break;

                    case("order_date"):
                        order.setOrder_date(LocalDate.parse(updatedValue));
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
        return "Orders{" +
                "orders=" + orders +
                '}';
    }
}
