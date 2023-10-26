package java_week_2_homeork;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output:
 * Binary number is : 101
 */
public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        System.out.println("Welcome to Java program to convert decimal numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter deccimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //Closing the sccanner object
        scanner.close();
    }
    //Converting the decimal number
    public static void convertDecimalToBinary(int number){
        String binary= Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}
