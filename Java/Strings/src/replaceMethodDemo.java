public class replaceMethodDemo {

    /*

    Java String replace()
    The java string replace() method returns a string replacing all the old char
    or CharSequence to new char or CharSequence.

    signature:

    public String replace(char oldChar, char newChar)
    and
    public String replace(CharSequence target, CharSequence replacement)


     */

    public static void main(String[] args) {

        String s1 = "Some day I\'ll buy the Ritz ";

        //Replace all occurrences of letter 'a' with 'e' in the string
        String replaceString = s1.replace('a', 'e');

        System.out.println(replaceString);

        //Java String replace(CharSequence target, CharSequence replacement)

        String presentTense = " He is James and he is Canadian";

        //Replace all occurrences of letter 'a' with 'e' in the string
        String replaceString2 = presentTense.replace("is", "was");

        System.out.println(replaceString2);

        // ----------  using ReplaceAll() Method

        String word2 = " she is Amy Raine and she is Canadian";

        String replaceString3 = word2.replaceAll("Amy", "slut");
        System.out.println(replaceString3);


    }
}
