public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    Rectangle Rectangle1 = new Rectangle(2, 2);
    Rectangle Rectangle2 = new Rectangle(4, 4);

    System.out.println(Rectangle1.Fits(Rectangle2));
    System.out.println(Rectangle2.Fits(Rectangle1));
  }
}