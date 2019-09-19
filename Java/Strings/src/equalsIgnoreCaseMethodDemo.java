import java.util.ArrayList;

public class equalsIgnoreCaseMethodDemo {

    /*
    The String equalsIgnoreCase() method compares the two given strings
    on the basis of content of the string irrespective of case of the string.

    It is like equals() method but doesn't check case.
    If any character is not matched, it returns false otherwise it returns true.


     */

    public static void main(String[] args) {


        String s1 = "JavaRules";
        String s2 = "java rules";
        String s3 = "JavaRules";

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("------------------------------");

        String TorontoPros = "isla david";

        ArrayList<String> providerList = new ArrayList<>();

        providerList.add("Isla David");
        providerList.add("Top Drawer");
        providerList.add("Passion");
        providerList.add("Kate Compton");
        providerList.add("Madison winter");
        providerList.add("Maddie Swann");
        providerList.add("Evana Bloor");

        for (String str: providerList){

            if (str.equalsIgnoreCase(TorontoPros)){
                System.out.println("We'll have fun with this provider");
                break;
            } else {
                System.out.println("We need to to do some searches on MERB");
            }
        }

    }

}
