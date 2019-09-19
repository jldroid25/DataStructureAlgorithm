import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapStructure {

    //       - How Hashmap works:

    public static void main(String[] args) {

        Country canada = new Country("Canada", 32000000);
        Country japan = new Country("Japan", 4000000);
        Country france = new Country("France", 75000000);
        Country  germany = new Country("Germany", 50000000);
        Country England = new Country("England", 60000000);

        //A HashMap to store objects by Key-Value pair (Country & Capital)
        HashMap<Country, String> countryCapitalMap = new HashMap<>();

        //Now lets store Respective country's capital key-value in Hashmap
        countryCapitalMap.put(canada,"Ottawa");
        countryCapitalMap.put(japan,"Tokyo");
        countryCapitalMap.put(france,"Paris");
        countryCapitalMap.put(germany,"Berlin");
        countryCapitalMap.put(England,"London");

        //Loop to print

        for (Country countryObj : countryCapitalMap.keySet()) {

            String capital = countryCapitalMap.get(countryObj);

            System.out.println(countryObj.getName() + "-----" + capital);
        }

    }

}
