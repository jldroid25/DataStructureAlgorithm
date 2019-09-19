public class Employee {

    String name;
    int age;

    public Employee(int age){
        this.age = age;
    }

    public void workOnAssignment(){

        //Do something on this assignment.
        System.out.println("I'm working here ....");
    }

    public static void main(String[] args) {

        //create an object of the employee type

        Employee employee1 = new Employee(20);
        employee1.age = 23;
        employee1.name = "Nordik Volkan";
        employee1.workOnAssignment();
    }
}
