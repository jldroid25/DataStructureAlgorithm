import java.util.ArrayList;

public class ArrayListDemo {

    /*
    ArrayList in java is most common Collections data structure
    along with HashMap which we use very often.

    Why to choose ArrayList vs Array:

    - Array is fixed length data structure If array is full ,
    you can not add element to it,

    - whereas ArrayList in java can dynamically grow and shrink as per our need.

    - You can use generics with ArrayList but not with Array

    - ArrayList have predefined methods which can be used to perform operations.

    Some important points about ArrayList in java are:

    - ArrayList is implementation of list interface.

    - ArrayList is not synchonized(so not thread safe)

    - ArrayList is implemented using array as internal data structure.It can be dynamically resized .

    - ArrayList increases half of its size when its size is increased.
     */

    public static void main(String[] args) {

        ArrayList<String> employeeList = new ArrayList<>();

        employeeList.add("James");
        employeeList.add("Kiera");
        employeeList.add("Ava");
        employeeList.add("Isla");
        employeeList.add("April");
        employeeList.add("XOGirls");
        employeeList.add("XOGirls");

        System.out.println("---------------------------");
        for (String employeeName : employeeList) {

            System.out.println(employeeName);
        }
    }
}
