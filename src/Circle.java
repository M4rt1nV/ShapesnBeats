public class Circle {

  double Radius;

  public Circle(double r) {
    Radius = r;
  }

  public Circle() {
    this(8);
  }

  public double Diameter() {
    return this.Radius * 2;
  }

  public double Diameter(int r) {
    return r * 2;
  }

  public void Radius(int d) {
    this.Radius = (double) d / 2;
  }

  public double Circumference() {
    return 2 * Math.PI * this.Radius;
  }

  public double Circumference(int r) {
    return 2 * Math.PI * r;
  }

  public double Surface() {
    return Math.PI * (this.Radius * this.Radius);
  }

  public double Surface(int r) {
    return Math.PI * (r * r);
  }
}
