public class OrderQueue {
    int stock;
    LinkedQueue<CustomerOrder> orders;

    public OrderQueue() {
        stock = 0;
        orders = new LinkedQueue<CustomerOrder>();
    }

    public OrderQueue(int stock) {
        this.stock = stock;
        orders = new LinkedQueue<CustomerOrder>();
    }

    public void addOrder(String name, String date, int quantity) {
        CustomerOrder order = new CustomerOrder(name, date, quantity);
        orders.enqueue(order);
    }

    public void addStock(int newStock) {
        stock += newStock;
    }

    public void fulfillOrder() {
        if(stock==0) {
            return;
        }
        CustomerOrder currentOrder = orders.getFront();
        currentOrder.shipProduct();
        stock--;
        if(currentOrder.quantity==0) {
            orders.dequeue();
        }
    }

    public void sellAllStock() {
        while(stock!=0 && orders.getFront()!=null) {
            fulfillOrder();
        }
    }

    @Override
    public String toString() {
        return ""+orders.getFront().quantity;
    }
}
