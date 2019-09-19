public class ValueOfMethodDemo {

    /*
    The java string valueOf() method converts different types of values into string.

    By the help of string valueOf() method,
    you can convert int to string, long to string,
    boolean to string, character to string, float to string, double to string,
     object to string and char array to string.
     */

    public static void main(String[] args) {

        int value = 30;
        //convert int value 30 to string value 30
        String s1 = String.valueOf(value);

        //concatenate them now
        System.out.println(s1 + 10);
    }
}
