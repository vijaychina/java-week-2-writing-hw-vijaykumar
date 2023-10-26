package java_week_2_homeork;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data : input a number : 8
 * Expected Output :
 * 8 * 1 = 8
 * 8 * 2 = 16
 * 8 * 3 = 24
 * ...
 * 8 * 10 = 80
 */
public class Programme_10_MultiplicationTable {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number : ");
        int number = scanner.nextInt();
        multiplicationTableOf(number);
        // closing the scanner object
        scanner.close();
    }

    //Printing the multiplication table of entered number
    public static void multiplicationTableOf(int number){
        System.out.println(number + " x " + 1 + " = " + (number));
        System.out.println(number + " x " + 2 + " = " + (number * 2));
        System.out.println(number + " x " + 3 + " = " + (number * 3));
        System.out.println(number + " x " + 4 + " = " + (number * 4));
        System.out.println(number + " x " + 5 + " = " + (number * 5));
        System.out.println(number + " x " + 6 + " = " + (number * 6));
        System.out.println(number + " x " + 7 + " = " + (number * 7));
        System.out.println(number + " x " + 8 + " = " + (number * 8));
        System.out.println(number + " x " + 9 + " = " + (number * 9));
        System.out.println(number + " x " + 10 + " x "+ (number * 10));
    }
}
