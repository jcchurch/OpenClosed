public class QuantityPriceRule implements IPriceRule {
    public boolean isMatch(Item item) {
        return item.getPriceType().equals("BY_QUANTITY");
    }

    public int total(Item item) {
        return item.getQuantity() * 300;
    }
}
