public class LastIndexOfMethodDemo {

    /*
    Java String lastIndexOf()
    The java string lastIndexOf() method returns last index of the given character value
    or substring. If it is not found, it returns -1.

    The index counter starts from zero.
     */

    public static void main(String[] args) {

        String s1 = "This is index of example";

        int index1 = s1.lastIndexOf('s');
        int index2 = s1.lastIndexOf('s', 5);
        int index3 = s1.lastIndexOf("xamp");



        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);


    }

}
