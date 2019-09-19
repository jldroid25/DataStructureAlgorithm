import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    /*
    LinkedHashMap is same as HashMap except that it maintains insertion order.

    Some points about LinkedHashMap:

    - LinkedHashMap implements Map interface and extends HashMap class.

    - LinkedHashMap maintains insertion order,
      so  you will be able to access elements
      in the order they were inserted like ArrayList.

    - LinkedHashMap maintains doubly Linked list to maintain insertion order.

     */

    public static void main(String[] args) {

        // LinkedHashMap with Country as key and capital as value
        // LinkedHashMap maintains insertion order

        LinkedHashMap<String, String> countryCapitalMap = new LinkedHashMap<>();

        countryCapitalMap.put("Norway", "Oslo");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Russian", "Moscow");

        System.out.println("------------------");

        for (String countryKey: countryCapitalMap.keySet()){
            System.out.println("Country: " +
                    countryKey + " and it's Capital: " +
                    countryCapitalMap.get(countryKey));
        }
        System.out.println("-------------------------");

    }
}
