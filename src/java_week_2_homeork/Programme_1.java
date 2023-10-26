package java_week_2_homeork;

/**
 * Write a Java Programme using the following steps.
 * Declare two instance variables.
 * Declare one instance method.
 * Call both instance variable into the instance method the print statement.
 * Declare the main method.
 * Call the above instance method into the main method and run the programme.
 */
public class Programme_1 {

    //1.1 Declare two instance variables.
    int a = 10;
    int b = 20;

    //1.2 Declare one instance method.
    //1.3 Call both instance vaariable into the instance method the print statement.
    public void instaneMethod(){
        System.out.println(a);
        System.out.println(b);

    }

    //1.4 Declare the main method.
    // Call the value above instance method into the main mathod and run the programme.
    public static void main(String[] args) {
        Programme_1 programme1 = new Programme_1();
        programme1.instaneMethod();
    }
}
