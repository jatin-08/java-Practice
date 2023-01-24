// Given a String containing digits from 2-9 inclusive, return all posible letter combination that the number could represent. Return the answer in any order.

import java.util.*;

public class KeyPadCombination {

    // Creating a Combination -> That return all possible letter combination of that number.
    // Time complexity -> T(n) = O(n.4^n).
    public static void combination(String dig, String[]kp, String res){
        // Base Case
        if(dig.length() == 0){
            System.out.print(res+" ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for(int i = 0; i<currChoices.length();i++){
            combination(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }

  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String in term of Number: ");
    String dig = sc.next();
    String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    System.out.print("The given combination: ");
    combination(dig, kp, "");
  }
}
