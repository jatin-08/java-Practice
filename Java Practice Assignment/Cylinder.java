/*

5. Write a Cylinder class which extends all the feature of Circle class : 
class Cylinder extends Circle : 
  Data member : 
   double height 
  Methods : 
   Cylinder() 
   Cylinder(double radius, double height) 
   double curvedSurfaceArea() 
   double volume() 
   void totalSurfaceArea()

*/

public class Cylinder extends Circle {

  public double height;

  // This Constructor will set a defualt value of the variable
  public Cylinder() {
    this.height = 0;
  }

  // This Constructor will set a value that will pass on the object
  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  // Creating a curvedSurfaceArea() -> It will return the curved Surface Area of cylinder.
  public double curvedSurfaceArea() {
    double csa = 2 * 3.14 * this.radius * this.height;
    return csa;
  }

  // Creating a volume -> It will return the Volume of cylinder.
  public double volume() {
    double v = 3.14 * this.radius * this.radius * this.height;
    return v;
  }

  // Creating a totalSurfaceArea() -> It will return the Total Surface Area of cylinder.
  public void totalSurfaceArea() {
    double tsa = 2 * 3.14 * this.radius * (this.radius + this.height);
    System.out.println(tsa);
  }

  public static void main(String[] args) {
    Cylinder cy1 = new Cylinder(5, 8);

    double csa = cy1.curvedSurfaceArea();
    System.out.println(csa);

    double v = cy1.volume();
    System.out.println(v);

    cy1.totalSurfaceArea();
  }
}
