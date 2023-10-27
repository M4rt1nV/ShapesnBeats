public class Rectangle {

  int Length;
  int Width;

  public Rectangle(int l, int w) {
    Length = l;
    Width = w;
  }

  public Rectangle(int d) {
    this(d, d);
  }

  public Rectangle() {
    this(4, 2);
  }

  public int Surface() {
    return this.Length * this.Width;
  }

  public int Surface(int Length, int Width) {
    return Length * Width;
  }

  public int Circumference() {
    return ((this.Length * 2) + (this.Width * 2));
  }

  public int Circumference(int Length, int Width) {
    return ((Length * 2) + (Width * 2));
  }

  public float Fits(Rectangle rectangle) {
    return (float) this.Surface() / rectangle.Surface();
  }

  public int Poles() {
    return (int) Math.ceil(this.Circumference());
  }

  public double PoleDistance() {
    return this.Circumference() / this.Poles();
  }
}
