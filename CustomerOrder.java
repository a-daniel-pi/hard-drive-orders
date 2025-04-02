public class CustomerOrder {
    public String name;
    public String date;
    public int quantity;

    public CustomerOrder() {
        name = "";
        date = "01-01-1970";
    }

    public CustomerOrder(String name, String date, int quantity) {
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public void shipProduct() {
        if(quantity!=0) {
            quantity--;
        }
    }
}
