/*

4. Write a Circle class with following details : 
Class Circle : 
  Data member : 
   double radius 
  Methods : 
   Circle() 
   Circle(double) 
   double circumference() 
   double area() 

*/

public class Circle {

  public double radius;

  // This Constructor set the defualt value of the radius
  public Circle() {
    this.radius = 0.0;
  }

  // This Constructor set the value that are pass on the object.
  public Circle(double radius) {
    this.radius = radius;
  }

  //Creating a circumference() -> It will return the circumference of the circle
  public double circumference() {
    double circumference = 2 * 3.14 * this.radius;
    return circumference;
  }

  //Creating area() -> It will return the area of the circle
  public double area() {
    double area = 2 * 3.14 * this.radius * this.radius;
    return area;
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(5);

    double circumference = c1.circumference();
    System.out.println(circumference);

    double area = c1.area();
    System.out.println(area);
  }
}