package java_week_2_homeork;

/**
 * 3.1  Write a Java Programme using the following steps.
 * 3.2 Declare one instance and one static variable.
 * 3.3 Declare one instance method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statements.
 * 3.5 Declare the main method.
 * 3.6 Call both instance and static method into the main method and run the programme.
 */
public class Programme_3 {

    //3.1 Declare one instance and static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_3.surname);
    }

    //3.3 Declare one static method.
    //3.4 Call  both instance and static variables into both instancce and static methods insie the print statement.
    public static void staticMethod() {
        Programme_3 programme3 = new Programme_3();
        System.out.println(programme3.name);
        System.out.println(surname);
    }

    //3.5 Declare the main method.
    //3.6 Call both instance and static methods into the main method and run the programme.
    public static void main(String[] args) {
        Programme_3 programme3 = new Programme_3();
        programme3.instanceMethod();
        staticMethod();
    }
}

