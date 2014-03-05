public class WeightPriceRule implements IPriceRule {
    public boolean isMatch(Item item) {
        return item.getPriceType().equals("BY_WEIGHT");
    }

    public int total(Item item) {
        // Quantity really means 'Ounces'
        return item.getQuantity() * 45;
    }
}
