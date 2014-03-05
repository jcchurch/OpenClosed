import org.junit.Assert;
import org.junit.Test;

public class CartTest extends Cart 
{
   public CartTest() {}

   @Test
   public void testZeroWhenEmpty() {
      Cart myCart = new Cart();

      int expectedTotalAmount = 0;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "Add one item to the cart and compute the price by quantity.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testSingleQuantity() {
      Cart myCart = new Cart();
      myCart.add(new Item("Hat", "BY_QUANTITY", 2));

      int expectedTotalAmount = 600;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "Add one item to the cart and compute the price by quantity.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testSingleWeight() {
      Cart myCart = new Cart();
      myCart.add(new Item("Apples", "BY_WEIGHT", 10));

      int expectedTotalAmount = 450;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "Add one item to the cart and compute the price by weight.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testOneOfEach() {
      Cart myCart = new Cart();
      myCart.add(new Item("Hat", "BY_QUANTITY", 2));
      myCart.add(new Item("Apples", "BY_WEIGHT", 10));

      int expectedTotalAmount = 1050;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "Add one item to price by quantity and one by weight.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testOneTshirt() {
      Cart myCart = new Cart();
      myCart.add(new Item("T-shirt", "TSHIRT", 1));

      int expectedTotalAmount = 1500;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "1 t-shirt test.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testTwoTshirt() {
      Cart myCart = new Cart();
      myCart.add(new Item("T-shirt", "TSHIRT", 2));

      int expectedTotalAmount = 3000;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "2 t-shirt test.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testThreeTshirt() {
      Cart myCart = new Cart();
      myCart.add(new Item("T-shirt", "TSHIRT", 3));

      int expectedTotalAmount = 3000;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "3 t-shirt test.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testFourTshirt() {
      Cart myCart = new Cart();
      myCart.add(new Item("T-shirt", "TSHIRT", 4));

      int expectedTotalAmount = 4500;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "4 t-shirt test.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testFiveTshirt() {
      Cart myCart = new Cart();
      myCart.add(new Item("T-shirt", "TSHIRT", 5));

      int expectedTotalAmount = 6000;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "5 t-shirt test.",
         expectedTotalAmount, resultTotalAmount);
   }

   @Test
   public void testSixTshirt() {
      Cart myCart = new Cart();
      myCart.add(new Item("T-shirt", "TSHIRT", 6));

      int expectedTotalAmount = 6000;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "6 t-shirt test.",
         expectedTotalAmount, resultTotalAmount);
   }


   @Test
   public void testSevenTshirt() {
      Cart myCart = new Cart();
      myCart.add(new Item("T-shirt", "TSHIRT", 7));

      int expectedTotalAmount = 7500;
      int resultTotalAmount = myCart.totalAmount();

      Assert.assertEquals(
         "7 t-shirt test.",
         expectedTotalAmount, resultTotalAmount);
   }
}
