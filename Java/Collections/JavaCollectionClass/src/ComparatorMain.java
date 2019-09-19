import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {

        //Create some country Object
        Country2 canada = new Country2(1, "Canada");
        Country2  netherlands = new Country2(4, "Netherlands");
        Country2  germany = new Country2(3, "Germany");
        Country2 England = new Country2(2, "England");

        //Need to store them in a list so we can Compare/sort them later
        List<Country2> listCountries = new ArrayList<>();
        listCountries.add(canada);
        listCountries.add(netherlands);
        listCountries.add(England);
        listCountries.add(germany);

        //Loop to print them
        System.out.println("List of Countries Before Sorted by Id: ");

        for (int i = 0; i < listCountries.size(); i++){
            Country2 country2 = listCountries.get(i);
            System.out.println("Country Id:" + country2.getCountryId() +
                    "\tCountry Names: " + country2.countryName);
        }

        System.out.println("------------------------------------------");

        //Now let's sort them
        Collections.sort(listCountries, new CountrySortByIdComparator());


        //Loop to print them
        System.out.println("List of Countries After being Sorted by Id: ");

        for (int i = 0; i < listCountries.size(); i++){

            Country2 country2 = listCountries.get(i);
            System.out.println("Country Id:" + country2.getCountryId() +
                    "\tCountry Name: " + country2.countryName);
        }

        //Let's sort by Country Name,

        // Here we are using an Anonymous Comparator

        Collections.sort(listCountries, new Comparator<Country2>() {
            @Override
            public int compare(Country2 o1, Country2 o2) {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        });

        System.out.println("------------------------------------------");


        System.out.println("After List is Sorted by Name: ");

        for (int i = 0; i < listCountries.size(); i++) {
            Country2 country2 = listCountries.get(i);
            System.out.println("Country Id: " +
                    country2.getCountryId() +
                    " Country Name: " + country2.getCountryName());
        }
    }
}
