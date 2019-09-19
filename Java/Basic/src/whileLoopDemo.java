public class whileLoopDemo {

    //A while loop is suitable when you don't know the number of iterations
    // ahead of time.

    public static void main(String[] args) {
        int i = 1;

        while (i < 11 ){
            //Print even numbers
            if (i % 2 == 0) {
                System.out.println(" " + i);
            }
            i++;
        }
    }
}
