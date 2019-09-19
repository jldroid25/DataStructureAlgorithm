import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashmapToArrayListConversionMain {

    public static void main(String[] args) {

        HashMap<String, String> countryCapital = new HashMap<>();

        countryCapital.put("Canada", "Toronto");
        countryCapital.put("Quebec", "Montreal");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("Netherlands","Den Haag");
        countryCapital.put("UK","London");

        System.out.println("---------------------------");

        //Creating arrayList from just the Hashmap keys
        ArrayList<String> keysArrayList = new ArrayList(countryCapital.keySet());

        System.out.println("Here are the Keys");
        for (String playpen: keysArrayList){
            System.out.println(playpen);
        }

        System.out.println("---------------------------");

        //Creating arrayList from just the Hashmap values
        ArrayList<String> valuessArrayList = new ArrayList(countryCapital.values());

        System.out.println("Here are the values");
        for (String playpen2: valuessArrayList){
            System.out.println(playpen2);
        }

        System.out.println("---------------------------");

        //Creating arrayList from just the Hashmap keys & values

        ArrayList<Map.Entry<String, String>> entrysArrayList = new
                ArrayList<>(countryCapital.entrySet());

        System.out.println("Here are the Keys & values");

        for (Map.Entry<String, String> playpen3: entrysArrayList){
            System.out.println("Country " + playpen3.getKey() + " and Capital: " +
                    playpen3.getValue());
        }

    }
}
