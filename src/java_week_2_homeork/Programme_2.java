package java_week_2_homeork;

/** Write a Java Programme using the following steps.
 * Declare two static variables.
 * declare one static method.
 * Call both static variables into the static method inside the print statement.
 * Declare the main method.
 * Call the static method into the main method and run programme.
 */
public class Programme_2 {
    //2.1 Declare two static variables.
    static int a = 100;
    static int b = 200;

    //2.2 Declare the one static method.
    //2.3 Call both static variables into the static inside the print statement.
    public static void staticMethod(){
        System.out.println(a);
        System.out.println(b);
    }

    //2.4 Declare the main method.
    //2.5 Call the static method into the main method and run programme.
    public static void main(String[] args) {
        staticMethod();
    }
}
