public class LowerUpperCaseMethodsDemo {


    /*

    -- toLowerCase()
    The java string toLowerCase() method returns the string in lowercase letter.
    In other words, it converts all characters of the string into lower case letter.
     */

    /*
    toUpperCase()
    The java string toUpperCase() method returns the string in uppercase letter.
    In other words, it converts all characters of the string into upper case letter.
     */
    public static void main(String[] args) {
        String s1 = "JAVAPOINT HELLO JAMES";

        String s1Lower = s1.toLowerCase();
        System.out.println(s1Lower);

        String s2 = "welcome to paradiseNotHell club ";

        String s2Lower = s2.toUpperCase();
        System.out.println(s2Lower);
    }
}
