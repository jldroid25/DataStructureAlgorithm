import java.util.ArrayList;

public class EqualsMethodDemo {

    /*
    Java String equals()
    The java string equals() method compares the two given strings
    based on the content of the string.

    If any character is not matched, it returns false.

    If all characters are matched, it returns true.
     */

    public static void main(String[] args) {

        String s1 = "Les chemise the l'archiduchess sont elle seche ou archy seche";

        String s2 = "If I have seen further it is by standing on shoulders of giants";

        System.out.println(s1.equals(s2));


        //Test for equality od String in a list
        System.out.println("------------------------------");

        String TorontoPros = "Isla David";

        ArrayList<String> providerList = new ArrayList<>();

        providerList.add("Top Drawer");
        providerList.add("Passion");
        providerList.add("Isla David");
        providerList.add("Kate Compton");
        providerList.add("Madison winter");
        providerList.add("Maddie Swann");
        providerList.add("Evana Bloor");

        for (String str: providerList){
            if (str.equals(TorontoPros)){
                System.out.println("We'll have fun with this provider");
                break;
            } else {
                System.out.println("We need to to do some searches on MERB");
            }
        }
    }
}
