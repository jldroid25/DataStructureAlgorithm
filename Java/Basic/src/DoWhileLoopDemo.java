public class DoWhileLoopDemo {

    /*
    If you want the body of a code to be executed at least once
    use a do-while loop
     */

    public static void main(String[] args) {
        int i = 16;
        do {
            //Execute this code at least once weather condition is true or not .
            //System.out.println(" Wining number(s) " + i);

            //Print only even numbers
            if (i % 2  == 0){
                System.out.println(" "+ i);
            } else {
                System.out.println(" i: is not an Even Number");
            }
            i++;
        } while (i < 11);
    }
}
