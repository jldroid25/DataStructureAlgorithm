public class ThreadExampleMain {

    public static void main(String[] args) {

        /*

        ThreadDemo td = new ThreadDemo();

        System.out.println();

        td.start();

         */

        //Runnable way
        ThreadRunnableDemo threadRunnableDemo = new ThreadRunnableDemo();

        Thread t = new Thread(threadRunnableDemo);
        t.start();
    }
}
