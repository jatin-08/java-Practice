/*
 2. Write a program for Quadratic equation 𝒂𝒙𝟐 + 𝒃𝒙 + 𝒄 where a, b, c are integer values. 
  Find roots of the equation. 
  Class Qe : 
  Data member : int a, b, c 
  Methods : 
  Qe() 
  Qe(int, int, int) 
  void result() // Output : Roots are real : value1, value2 
  // : Roots are imaginary. 
  : Roots are equal : value 
 
 */

import java.lang.Math;

public class Qe {

  public int a;
  public int b;
  public int c;

  // It will assign 0 to all the variable.
  public Qe() {
    this.a = 0;
    this.b = 0;
    this.c = 0;
  }

  // It will store  the value which will pass on the object.
  public Qe(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  // Creating a result () -> It will return if the roots are real, equal and imaginary
  public void result() {
    int dis = b * b - 4 * a * c;

    if (dis > 0) {
      double root1 = (-b + Math.sqrt(dis)) / (2 * a);
      double root2 = (-b - Math.sqrt(dis)) / (2 * a);
      System.out.println("Roots are real: " + root1 + ", " + root2);
    } else if (dis == 0) {
      double root = -b / (2 * a);
      System.out.println("Roots are equal: " + root);
    } else {
      System.out.println("Roots are imaginary");
    }
  }

  public static void main(String[] args) {
    Qe equation1 = new Qe(2, 5, 2);
    equation1.result();

    Qe equation2 = new Qe(1, -2, 1);
    equation2.result();

    Qe equation3 = new Qe(1, 2, 3);
    equation3.result();
  }
}
