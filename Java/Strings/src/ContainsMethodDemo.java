public class ContainsMethodDemo {

    /*
    The java string contains() method searches the sequence of characters in this string.

    It returns true if sequence of char values are found in this string
    otherwise returns false.


     */

    public static void main(String[] args) {

        String providers = "Keira is submissive loves BDSM and greek";

        System.out.println(providers.contains("BDSM"));

        System.out.println(providers.contains("submissive"));

        System.out.println(providers.contains("Bdsm"));

        /*

        The contains() method is helpful to find a char-sequence in the string.
        We can use it in control structure to produce search based result.
        Let us see an example below.
         */

        String cananaPros = "Keira is submissive loves BDSM and greek";

        if (cananaPros.contains("BDSM")){
            System.out.println("She's submissive & is open to be dominated");
        } else {
            System.out.println("She's probably just GFE");
        }
    }
}
