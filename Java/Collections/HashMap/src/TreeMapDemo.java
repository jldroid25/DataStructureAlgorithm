import java.util.TreeMap;

public class TreeMapDemo {

    /*
    TreeMap class implements Map similar to HashMap.

    Some important points about TreeMap:

    1-TreeMap implements Map interface and extends HashMap class.

    2-TreeMap is implemented using Red black tree based NavigableMap.

    3-TreeMap is ordered collection and store its elements in natural ordering of keys.

    4-Key which you would like to put in TreeMap must
    implement Comaparable interface or you can use Comparator for custom sorting
     */
    public static void main(String[] args) {

        //Use TreeMap if you need Key-value pair to be automatically sorted.

        TreeMap<String, String> countryCapitalMap = new TreeMap<>();

        countryCapitalMap.put("Norway", "Oslo");
        countryCapitalMap.put("Sweden", "Stockholm");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("Finland", "Helsinki");
        countryCapitalMap.put("Iceland", "Raykevik");

        System.out.println("------------------");

        for (String countryKey: countryCapitalMap.keySet()){
            System.out.println("Country: " +
                    countryKey + " and it's Capital: " +
                    countryCapitalMap.get(countryKey));
        }
        System.out.println("-------------------------");
    }
}

