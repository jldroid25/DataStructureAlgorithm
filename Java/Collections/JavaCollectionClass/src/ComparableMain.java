import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

    public static void main(String[] args) {

        //Create some country Object
        Country canada = new Country(1, "Canada");
        Country  russia = new Country(4, "Russia");
        Country  germany = new Country(3, "Germany");
        Country England = new Country(2, "England");

        //Need to store them in a list so we can Compare/sort them later
        List<Country> listCountries = new ArrayList<>();
        listCountries.add(canada);
        listCountries.add(russia);
        listCountries.add(England);
        listCountries.add(germany);

        //Loop to print them
        System.out.println("List of Countries Before Sorted by Id: ");

        for (int i = 0; i < listCountries.size(); i++){
            Country country = listCountries.get(i);
            System.out.println("Country Id:" + country.getCountryId() +
                    "\tCountry Names: " + country.countryName);
        }

        System.out.println("------------------------------------------");


        //Now let's sort them
        Collections.sort(listCountries);

        //Loop to print them
        System.out.println("List of Countries After being Sorted by Id: ");

        for (int i = 0; i < listCountries.size(); i++){

            Country country = listCountries.get(i);
            System.out.println("Country Id:" + country.getCountryId() +
                    "\tCountry Name: " + country.countryName);
        }

    }
}
