public class SleepMethodDemo {

    /*
    Sleep method of java.lang. Thread is used to pause current execution of thread
    for specific period of time.

     Some important points about sleep method are :

    It causes current executing thread to sleep for specific amount of time.

    Its accuracy depends on system timers and schedulers.

    It keeps the monitors it has acquired, so if it is called from synchronized context, no other thread can enter that block or method.

    -If we call interrupt() method , it will wake up the sleeping thread.
     */

    public static void main(String[] args) {

        SleepMethodThread ft = new SleepMethodThread();

        Thread t = new Thread(ft);

        t.start(); //Start the thread

        long startTime = System.currentTimeMillis();

        try {
            //Put the thread to sleep
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        long timeDifference = (endTime - startTime);

        System.out.println("Time difference between before and after sleep call " +
                timeDifference);

    }
}
