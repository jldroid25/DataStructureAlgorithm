public class TreeSetDemo  implements Comparable{



    /* Java TreeSet have following properties:

            1- It can contain only unique element.

            2- It stores objects in ascending order by default,

            3- It implements NavigableSet interface which extends SortedSet.

            4- When you put objects in TreeSet, it must implement Comparable interface.
*/

    String providerName;

    public TreeSetDemo(String providerName){
        super();
        this.providerName = providerName;
    }

    @Override
    public int compareTo(Object o) {

        TreeSetDemo provider = (TreeSetDemo) o;

        return this.providerName.compareTo(provider.providerName);
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
