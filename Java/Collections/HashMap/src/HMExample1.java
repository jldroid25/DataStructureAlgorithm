import java.util.HashMap;

public class HMExample1 {

    public static void main(String[] args) {
        //Basic example of a HashMap use

        //Create a lookup table or Hashmap to store Key-value info
        HashMap<Integer, String> employee = new HashMap<>();

        //Let's add employees to the HashMap
        employee.put(1,"Kiera Able");
        employee.put(2,"April Rose");
        employee.put(3,"Sasha Johanson");
        employee.put(4,"Amy Rayne");

        // Iterating HashMap Using keySet() and for each loop
        System.out.println("---Canada's Best C.N.C providers---");

        System.out.println("------------------------------");

        for(Integer empId : employee.keySet()){
            System.out.println("empId:" + empId +
                    " and Emp Name: " + employee.get(empId));
        }
        System.out.println("------------------------------");


    }
}
