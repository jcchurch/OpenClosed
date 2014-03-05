public class Item {
    private String name;
    private String priceType;
    private int quantity;

    public Item(String name, String priceType, int quantity) {
        this.name = name;
        this.priceType = priceType;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public String getPriceType() { return priceType; }
    public int getQuantity() { return quantity; }
}
