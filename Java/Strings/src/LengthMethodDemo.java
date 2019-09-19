public class LengthMethodDemo {

    /*

    Java String length()

    The java string length() method length of the string.

    It returns count of total number of characters.

    The length of java string is same as the unicode code units of the string.
     */

    public static void main(String[] args) {

        String password = "Bostongardenboyltonstree22";

        System.out.println(password.length());

        String shortPassword = "abcde234";
        String emptyPassword = "";

        if (shortPassword.length() < 6){

            System.out.println("Password is too short");
        } else if (emptyPassword.isEmpty()){

         System.out.println("Password is empty");
        } else {
            System.out.println("Try again later");

        }
    }
}
