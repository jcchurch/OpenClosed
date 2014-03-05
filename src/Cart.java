import java.util.ArrayList;

public class Cart {
   private ArrayList<Item> myItems;
   private PriceContext pc;

   public Cart() {
       myItems = new ArrayList<Item>();
       pc = new PriceContext();
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
           total += pc.total(thisItem);
       }

       return total;
   }
}
