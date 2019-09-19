public class getCharMethodsDemo {

    /*
    The java string getChars() method copies the content of this string
    into specified char array.

    There are 4 arguments passed in getChars() method.

    The signature of getChars() method is given below:

    public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)

     */

    public static void main(String[] args) {

        String code = "Java Developer needs Data Structure & algorithm";

        char[] ch = new char[10];

        try {
            code.getChars(5, 15, ch, 0);

            System.out.println(ch);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
