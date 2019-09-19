public class ForLoopDemo {

    //for loop is use when you know the number of iterations ahead of time
    // before your print them
    public static void main(String[] args) {

        int[] numbers = {32, -23, 66, 56, 100};

        /*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" " + numbers[i]);
        }

         */
        for (int i = 10; i > 0; i-- ){
            System.out.println(" " + i);
        }
    }
}
