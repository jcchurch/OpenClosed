import java.util.ArrayList;

/* This is what our cart class looks like before
   our rule changes and before refactoring.
 */
public class Cart {
   private ArrayList<Item> myItems;

   public Cart() {
       myItems = new ArrayList<Item>();
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
           String type = thisItem.getPriceType();

           if (type.equals("BY_QUANTITY")) {
               total += thisItem.getQuantity() * 300;
           }
           else if (type.equals("BY_WEIGHT")) {
               // Quantity really means 'Ounces'
               total += thisItem.getQuantity() * 45;
           }
       }

       return total;
   }
}
