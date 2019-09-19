public class SplitMethodDemo {

    /*
    The java string split() method splits this string against
    given regular expression and returns a char array.
     */

    public static void main(String[] args) {

        //The given example returns total number of words in a string excluding
        // space only. It also includes special characters

        String s1 = "Java String Split method by Javapoint";

        String[] words = s1.split("\\s");

        for (String w : words){
            System.out.println(w);
        }
    }
}
