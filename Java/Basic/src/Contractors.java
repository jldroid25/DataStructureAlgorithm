public class Contractors extends Employee {

    public Contractors(int a){
        super(a);//

    }

    public static void main(String[] args) {
        Employee objB = new Employee(12);

        objB.workOnAssignment();
        System.out.println("Value of Variable age is: " + objB.age);

    }
}
