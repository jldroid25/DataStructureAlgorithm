public class HashSetDemo {

    /*
    HashSetDemo implements Set interface which does not allow duplicate value.
    It is not synchronized and is not thread safe.

    - In case of primitive types(such as interger, String) it is straight forward

    - In case of custom defined objects. it depends how how hashcode() was defined.

    - SO Hash set is a good tool if you're looking for duplicates or don't want them.
     */

    public static void main(String[] args) {


        java.util.HashSet nameSet = new java.util.HashSet();

        nameSet.add("Isla");
        nameSet.add("Isla");
        nameSet.add("Sasha");

        System.out.println("NameSet size: " + nameSet.size()); //2 not 3
        System.out.println(nameSet);

        /*
        If we had a custom HashSetDemo with defined hashcode()
        with different hash-code values the result would be 3.
         */
    }
}
