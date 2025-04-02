public class OrderTester {
    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue(14);
        orderQueue.addOrder("Bob the Conquerer of Planets", "04-01-2025", 5);
        orderQueue.addOrder("Jeff the Destroyed of Worlds", "03-31-2025", 5);
        orderQueue.addOrder("Eve the Exploder of Suns", "04-01-2025", 8);
        System.out.println(orderQueue);
        orderQueue.sellAllStock();
        System.out.println(orderQueue);
        orderQueue.addStock(10);
        orderQueue.addOrder("Alice the Destroyer of Galaxies", "04-01-2025", 3);
        orderQueue.addOrder("Bill the Mad Conquerer of Dimensions", "03-31-2025", 3);
        orderQueue.addOrder("Rose the All-Powerful Flower", "04-01-2025", 5);
        orderQueue.sellAllStock();
        System.out.println(orderQueue);
    }
}
