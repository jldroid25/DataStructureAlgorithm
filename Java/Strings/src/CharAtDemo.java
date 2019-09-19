public class CharAtDemo {

    /*
    The java string charAt() method returns a char value at the given index number.

    The index number starts from 0 and goes to n-1, where n is length of the string.

    It returns StringIndexOutOfBoundsException if given index number is greater than
    or equal to this string length or a negative number.

     */


    public static void main(String[] args) {

        String name = "James Lemaire";

        //Return the char value at index 6
        char ch = name.charAt(6);

        System.out.println(ch);

        int strLength =  name.length();

        //Return the char value at first index in the string
        System.out.println(name.charAt(0));


        //Return the char value at last  index in the String
        System.out.println(name.charAt(strLength -1));

        //Let's access all element present at odd index number
        for (int i = 0; i < name.length(); i++){
            if (i % 2 != 0){
                System.out.println("Char at " + i + " place " + name.charAt(i));
            }
        }

        //Let's count Frequency (# of times it appears )
        // of a character in the String.
        int count = 0;

        for (int i = 0; i < name.length() -1; i++){
            if (name.charAt(i) == 'e'){

             count++;
            }
        }
        System.out.println("Frequency of letter e in the string is " + count);
    }
}
