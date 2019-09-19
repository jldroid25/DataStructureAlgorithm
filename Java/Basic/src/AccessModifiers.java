
public class AccessModifiers {

    /*
    The access modifiers in java define accessibility (scope) of variable, method,
    constructor or class.

    There are 4 types of access modifiers in java.
    Public, Private, Protected, Default(JVM will provide it if you don't provide none)

     */

    public static void main(String[] args) {
        Employee objA = new Employee(20);
        objA.workOnAssignment();
        System.out.println("Value of Variable Age in employee class: " + objA.age);
    }

}
