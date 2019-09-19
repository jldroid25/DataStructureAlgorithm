public class ConcatMethodDemo {

    /*
    The java string concat() method combines specified string at the end of this string.

    It returns combined string.

    It is like appending another string.
     */

    public static void main(String[] args) {

        String s1 = "Java String";

        s1.concat("is immutable");

        System.out.println(s1); //will not concat

        //Assign it explicitly to contact the string
        s1 = s1.concat("is immutable so assign it explicitly");
        System.out.println(s1);
    }
}
