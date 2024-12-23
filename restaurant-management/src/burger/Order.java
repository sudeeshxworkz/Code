package burger;

public class Order {
    private int orderId;
    private String orderDate;
    private String customerName;
    private String foodItem;

    public Order(){
        System.out.println("Order Constructor is created");
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public String getFoodItem() {
        return foodItem;
    }

    @Override
    public int hashCode() {
        return this.getOrderId();
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", orderDate='" + orderDate + '\'' + ", customerName='" + customerName + '\'' + ", foodItem='" + foodItem + '\'' + '}';
    }
}
