public class TrimMethodDemo {

    /*
    The java string trim() method eliminates leading and trailing spaces.

    The unicode value of space character is '\u0020'.

    The trim() method in java string checks this unicode value before
    and after the string, if it exists then removes the spaces
    and returns the omitted string.

     */

    public static void main(String[] args) {
        String s1 = " hello   ";

        System.out.println(s1 + "dangerous beasts");

        System.out.println(s1.trim() + "docile animals  nicely done");

        System.out.println();
    }
}
