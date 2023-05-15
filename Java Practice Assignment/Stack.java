/*
3. Prepare Stack using Object Oriented Approach : 
   Class Stack : 
    Data member : 
    char array of size 5 
    int top 
    Methods : 
    void push( char ) 
    char pop( ) 
    (Menu driven Program using switch case) 
 */

 public class Stack {
    public char[] stackArray;
    public int top;
    

    // In this we were assign the default value to the variable
    public Stack() {
        stackArray = new char[5];
        top = -1;
    }


    // Creating a push () -> It will add the element on the stack
    public void push(char element) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack Overflow: Cannot push element " + element);
        } else {
            top++;
            stackArray[top] = element;
            System.out.println("Pushed element " + element + " to the stack.");
        }
    }

    // Creating a pop() -> It will remove the element from the stack
    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Cannot pop element from an empty stack.");
            return '\0';
        } else {
            char poppedElement = stackArray[top];
            top--;
            return poppedElement;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        int choice;
        char element;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSTACK MENU");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    element = System.console().readLine().charAt(0);
                    stack.push(element);
                    break;
                case 2:
                    char poppedElement = stack.pop();
                    if (poppedElement != '\0') {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

