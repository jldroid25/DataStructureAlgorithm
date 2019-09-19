public class LinkedHashSet {

    /*
     LinkedHashSet is same as HashSet except that it maintains insertion order.

    Some points about LinkedHashSet

    -LinkedHashSet implements Set interface and extends HashSet class.

    - LinkedHashSet maintains insertion order, so you will be able
    to access elements in the order they were inserted like ArrayList.

     */

    public static void main(String[] args) {

        // LinkedHashset Example
        //LinkedHashset maintains insertion sort

        java.util.LinkedHashSet<String> countryHashset = new java.util.LinkedHashSet();

        countryHashset.add("India");
        countryHashset.add("Japan");
        countryHashset.add("France");
        countryHashset.add("Russia");
        countryHashset.add("India");
        countryHashset.add("France");
        countryHashset.add("United Kingdom");

        System.out.println("-----------------------------");

        for (String country : countryHashset) {
            System.out.println(country);
        }
    }
}
