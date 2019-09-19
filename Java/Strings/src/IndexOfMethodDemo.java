public class IndexOfMethodDemo {

    /*
    Java String indexOf()

    The java string indexOf() method returns index of given character value or substring.

    If it is not found, it returns -1.

    The index counter starts from zero.

     */

    public static void main(String[] args) {

        String s1 = " This is an index example";

        //Passing substrings
        int index1 = s1.indexOf("is");

        int index2 = s1.indexOf("index");

        System.out.println(index1 + " " + index2);

        //Passing substring with from index

        int index3 = s1.indexOf("is", 4);
        System.out.println(index3);

        //Passing char values
        int index4 = s1.indexOf('s');
        System.out.println(index4);
    }
}
