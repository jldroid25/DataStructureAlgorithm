public class ContinueStatementDemo {

    /*
    Continue statement - is one of the different control statements which
    we use very often.

    If continue statement is found in loop,
    it will continue the current iteration and will not execute statements
    following continue statement.

    It is generally used to skip current iteration
    on the basis of some condition.
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9, 10};

        for(int i = 0; i < arr.length; i++){

            //Using the "continue" statement to skip even numbers
            if (arr[i] %2 == 0){
                continue;
            }
            //only print odd numbers
            System.out.println(" " + arr[i]);
        }
    }

}
