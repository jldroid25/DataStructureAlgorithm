public class VariablesDemo {

    /*
    There are 3 types of variables in Java.

    Local: is declared inside a method and therefore must be initialized.

    Instance: A variable declared at a class level can be termed "Instance variable"
              it is not mandatory to initialized such instance variable(s).
              By default the JVM will initialized all the instance variable.

    Static : These are class level variables declared with the key word "static".
             No objects is needed to work with this variable.
     */

    int a; // Instance Variable

    public static int b = 20; //Static variable

    public void printData(){

        int number = 10; //Local variable
        System.out.println("This method will print local variable values " + number);
    }

    public static void main(String[] args) {

        VariablesDemo demo = new VariablesDemo();
        System.out.println("Instance Variable: " + demo.a);
        System.out.println("Static Variable: " + demo.b);

        demo.printData();

    }
}
