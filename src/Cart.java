import java.util.ArrayList;

public class Cart {
   private ArrayList<Item> myItems;
   private IPriceRule[] PriceRules;

   public Cart() {
       myItems = new ArrayList<Item>();

       PriceRules = new IPriceRule[]{
                      new QuantityPriceRule(),
                      new WeightPriceRule(),
                      new TshirtPriceRule()
                    };
   }

   public void add(Item thisItem) {
       myItems.add(thisItem);
   }

   /*
       Returns the total amount of the cart in cents.
    */
   public int totalAmount() {
       int total = 0;

       for (Item thisItem : myItems) {
           for (IPriceRule ipr : PriceRules) {
               if (ipr.isMatch(thisItem)) {
                   total += ipr.total(thisItem);
               }
           }
       }

       return total;
   }
}
