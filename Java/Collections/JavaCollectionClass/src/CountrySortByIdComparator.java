/*
If country1.getCountryId()<country2.getCountryId():
then compare method will return -1

If country1.getCountryId()>country2.getCountryId():
then compare method will return 1

If country1.getCountryId()==country2.getCountryId():
then compare method will return 0

 */

import java.util.Comparator;

public class CountrySortByIdComparator  implements Comparator<Country2> {

    @Override
    public int compare(Country2 country1, Country2 country2) {
        return (country1.getCountryId() < country2.getCountryId() ) ? -1 :
                (country1.getCountryId() > country2.getCountryId() ) ? 1 : 0;
    }
}
