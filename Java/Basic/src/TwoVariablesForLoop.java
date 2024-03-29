import java.util.Scanner;

public class TwoVariablesForLoop {

    //We can use two variables i & j in a for loop.
    //Example -If you wanted to check of a string is a palindrome

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter s a string: ");

        String str = scanner.nextLine();

        boolean isPalin = isPalindrome(str);

        if (isPalin){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }

    static boolean isPalindrome(String str){

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--){

            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;

    }
}
