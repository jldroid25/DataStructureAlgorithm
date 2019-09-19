import java.util.ArrayList;
import java.util.HashSet;

public class RemoveArrayListDuplicates {

    /*

    Duplicates can be remove in Arraylist with 3 options.

    - Using iterative approach

    - Using HashSet (but does not maintain insertion order)

    - Using LinkedHashMap

     */

    public static void main(String[] args) {

        ArrayList<String> providersListName = new ArrayList<>();

        providersListName.add("James");
        providersListName.add("Keira");
        providersListName.add("April");
        providersListName.add("Isla");
        providersListName.add("Sasha");
        providersListName.add("Jasebel");
        providersListName.add("April");
        providersListName.add("James");

        System.out.println("Removing duplicates from the list");

        ArrayList uniqueElements = new ArrayList();

        //Using the Iterative Approach
        for (String providers : providersListName) {

            if (!uniqueElements.contains(providers)){
                uniqueElements.add(providers);

                System.out.println(providers);
            }
        }

    }
}
