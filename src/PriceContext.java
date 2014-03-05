public class PriceContext {
    private IPriceRule[] PriceRules;

    public PriceContext() {
       PriceRules = new IPriceRule[]{
                      new QuantityPriceRule(),
                      new WeightPriceRule(),
                      new TshirtPriceRule()
                    };
    }

    public int total(Item item) {
        int value = 0;
        for (IPriceRule ipr : PriceRules) {
            if (ipr.isMatch(item)) {
                value = ipr.total(item);
            }
        }
        return value;
    }
}
