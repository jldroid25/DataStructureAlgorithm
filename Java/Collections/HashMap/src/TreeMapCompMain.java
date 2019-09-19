import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapCompMain {

    /*
    What if you want custom sorting rather than natural ordering:

    If you want custom sorting , then you can using below TreeMap constructor.
    You can define your own comparator.

     */

    public static void main(String[] args) {
        
        Country2 india = new Country2("India", 1000);
        Country2 japan = new Country2("Japan", 2000);
        Country2 france = new Country2("France", 20000);
        Country2 russian = new Country2("Russian", 2000);

        //Create your custom sorting. - Reverse order o2 to o1
        Comparator<Country2> comparator = new Comparator<Country2>() {
            @Override
            public int compare(Country2 o1, Country2 o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };

        System.out.println("Sorting TreeMap in Reverse order of Country");

        TreeMap<Country2, String> countryCapitalMap = new TreeMap<>(comparator);

        countryCapitalMap.put(india, "Delhi");
        countryCapitalMap.put(japan, "Tokyo");
        countryCapitalMap.put(france, "Paris");
        countryCapitalMap.put(russian, "Moscow");

        for (Country2 countryObj : countryCapitalMap.keySet()) {

            String capital = countryCapitalMap.get(countryObj);

            System.out.println(countryObj.getName() + " --- " + capital);
        }
    }
}
