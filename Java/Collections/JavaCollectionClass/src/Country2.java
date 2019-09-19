/*
We will create class country having attribute id and name

and will create another class CountrySortByIdComparator
which will implement Comparator interface

and implement compare method to sort collection of country object by id
and we will also see how to use anonymous comparator.
 */

public class Country2 {

    int countryId;
    String countryName;

    public Country2(int countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
