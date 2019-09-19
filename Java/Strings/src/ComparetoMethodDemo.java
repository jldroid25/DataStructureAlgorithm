public class ComparetoMethodDemo {

    /*

    The java string compareTo() method compares the given
    string with current string lexicographically.
    It returns positive number, negative number or 0

    It compares strings on the basis of Unicode value of each character in the strings.


     */
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Meklo";
        String s3 = "Hello";

        System.out.println(s1.compareTo(s2)); // Neg # -5

        System.out.println(s2.compareTo(s3)); //Positive # 5

        System.out.println(s3.compareTo(s1)); //0 for equal

        //--------CompareTo() on Empty String---------//

        /*
        If you compare string with blank or empty string,
        it returns length of the string.

        If second string is empty, result would be positive.

        If first string is empty, result would be negative.

        */
        String day = "Wednesday";

        String emptyDay = "";

        String Devoracious = "C.N.C";

        //Positive # , second string is empty
        System.out.println(day.compareTo(emptyDay));

        //Negative result first string is empty
        System.out.println(emptyDay.compareTo(Devoracious));


    }
}
