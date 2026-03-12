import java.util.*;

public class Order {

    private String id;
    private List<OrderItem> items = new ArrayList<>();
    private OrderStatus status;

    public Order(String id) {
        this.id = id;
        this.status = OrderStatus.PENDING;
    }

    public void addItem(MenuItem item, int quantity) {
        items.add(new OrderItem(item, quantity));
    }

    public double calculateTotal() {

        return items.stream()
                .mapToDouble(OrderItem::getTotalPrice)
                .sum();

    }

}