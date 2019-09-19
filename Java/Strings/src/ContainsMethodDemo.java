public class ContainsMethodDemo {

    /*
    The java string contains() method searches the sequence of characters in this string.

    It returns true if sequence of char values are found in this string
    otherwise returns false.


     */

    public static void main(String[] args) {

        String providers = "Keira is nice  loves cakes and icecream";

        System.out.println(providers.contains("cakes"));

        System.out.println(providers.contains("loves"));

        System.out.println(providers.contains("IceCream"));

        /*

        The contains() method is helpful to find a char-sequence in the string.
        We can use it in control structure to produce search based result.
        Let us see an example below.
         */

        String cananaPros = "Keira is  nice loves cakes and iceCream";

        if (cananaPros.contains("cakes")){
            System.out.println("She has a sweet tooth & is open to sweet");
        } else {
            System.out.println("She's probably just skinny");
        }
    }
}
