// Write a program which takes the values of the length  and breadth from user and check if it is a square or not.

import java.util.Scanner;

public class PWL_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :");
        int length =sc.nextInt();
        System.out.print("Enter the breadth :");
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.print("It is square!!");
        }else{
            System.out.print("It is a reactangle!!");
        }
    }
}