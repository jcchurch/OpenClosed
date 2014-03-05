public interface IPriceRule {
   public boolean isMatch(Item item);
   public int total(Item item);
}
