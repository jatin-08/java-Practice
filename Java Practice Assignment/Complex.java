/*
1. Prepare Complex Class 
 Class Complex : 
  Data member : 
    int real 
    int img 
 Methods : 
    Complex() 
    Complex(int real, int img) 
    void incr(int, int) // increase the value real & img according to parameters 
    Complex sum(Complex) 
    int multiply(Complex) 
    void display() // display in format a + i b  

*/

public class Complex {

  public int real;
  public int img;

  // This Constructor store the  0 to both the variable if we don't assign the value to the variable
  public Complex() {
    this.real = 0;
    this.img = 0;
  }

  // This Constructor for assigning the value to the variable after creating the object
  public Complex(int real, int img) {
    this.real = real;
    this.img = img;
  }

  // Creating a incr() -> It will add the current value to the previous value
  public void incr(int realIncr, int imgIncr) {
    this.real += realIncr;
    this.img += imgIncr;
  }

  // Creating a sum() -> It will return the Sum of the Complex Number
  public Complex sum(Complex other) {
    int sumReal = this.real + other.real;
    int sumImg = this.img + other.img;
    return new Complex(sumReal, sumImg);
  }

  // Creating a multiply() -> It will return the Multiplication of the Complex Number And it return only real number product.
  public int multiply(Complex other) {
    int productReal = this.real * other.real - this.img * other.img;
    return productReal;
  }

  // Creating a display() -> It will display the complex according to the order
  public void display() {
    if (img >= 0) {
      System.out.println(real + " + " + img + "i");
    } else {
      System.out.println(real + " - " + img + "i");
    }
  }

  public static void main(String[] args) {
    Complex c1 = new Complex(2, 1);
    Complex c2 = new Complex(3, 2);

    c1.incr(2, 1);
    c1.display();

    Complex c3 = c1.sum(c2);
    c3.display();

    int productReal = c1.multiply(c2);
    System.out.println(productReal);
  }
}
