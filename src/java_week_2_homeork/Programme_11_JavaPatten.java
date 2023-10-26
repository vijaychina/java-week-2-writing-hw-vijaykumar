package java_week_2_homeork;

import java.sql.SQLOutput;

/**
 * Write a Java program to display the following patten.
 * Sample Patten:
 * J a v v a
 * J a a v v a a
 * J J aaaaa V V aaaaa
 * J J a a v a a
  */
public class Programme_11_JavaPatten {

    public static void main(String[] args) {
        Programme_11_JavaPatten t = new Programme_11_JavaPatten();
        System.out.println("-------------------------------------------");
        t.javaPatten();
    }
    //Printing the Java Patten
    public void javaPatten(){
        System.out.println("J  a v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");
    }
}
