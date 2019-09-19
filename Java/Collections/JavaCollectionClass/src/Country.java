
/*
- If this.countryId < country.countryId:then compare method will return -1
     Which means it is lesser than

- If this.countryId > country.countryId:then compare method will return 1
   Which means it is greater than

- If this.countryId==country.countryId:then compare method will return 0
      Which means it is equal to

-
We will create class country having attribute id and name.
This class will implement Comparable interface and implement CompareTo method
to sort collection of country object by id.

 */
public class Country implements Comparable<Country> {

    int countryId;
    String countryName;

    public Country(int countryId, String countryName) {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
    }

    @Override
    public int compareTo(Country country) {
        return (this.countryId < country.countryId) ? -1 :
                (this.countryId > country.countryId) ? 1 : 0;
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
