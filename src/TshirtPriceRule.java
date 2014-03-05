public class TshirtPriceRule implements IPriceRule {
    public boolean isMatch(Item item) {
        return item.getPriceType().equals("TSHIRT");
    }

    public int total(Item item) {
        int totalShirts = item.getQuantity();
        int freeShirts = totalShirts / 3;
        int paidShirts = totalShirts - freeShirts;
        return paidShirts * 1500;
    }
}
