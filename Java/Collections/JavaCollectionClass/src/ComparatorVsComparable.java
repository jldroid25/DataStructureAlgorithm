public class ComparatorVsComparable {

    /*
    Difference between Comparator and Comparable in java:

Comparable:

    - If your class implements the Comparable<> interface,
    that class needs to directly override the "CompareTo()" method (inside of it).

    -If any class implements comparable interface
    then collection of that object can be sorted automatically using Collection.sort()
    or Arrays.sort().
    Object will be sort on the basis of compareTo method in that class.

    Objects which implement Comparable in java can be used as keys in a SortedMap
     like TreeMap, or SortedSet like TreeSet without implementing any other interface.

    - Whereas for Comparator:
    The sorting logic can be in a separate class
    (Hence we can write different sorting based on different
    attributes of objects to be sorted. E.g. Sorting using id,name etc.)

    - If your class implements the Comparator<> interface,
    objects to be sorted do not need to implement this interface.
    Some third class can implement this interface to sort.

    For example:
    CountrySortByIdComparator class(a 3rd class) can implement Comparator interface
    to sort collection of country object by id.



     */
}
