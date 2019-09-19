public class JoinMethodMain {

    /*
     Thread class’s join method can be used to stop current execution
     of thread until thread it joins, completes its task.

     So basically , it waits for the thread on which join method
     is getting called, to die.

     ---- There are three variant of join method:

    1- public final void join() throws InterruptedException :
      Thread on which join method is getting called to die.

    2- public final void join(long millis) throws InterruptedException:
       This method when called on the thread, it waits for either of following:

       - Thread on which join method is getting called, to die.

       - Specified milliseconds


      3- public final void join(long millis, int nanos) throws InterruptedException:

       This method when called on the thread, it waits for either of following:
       - Thread on which join method is getting called, to die.
       - Specified milliseconds + nano seconds

     */

    public static void main(String[] args) {

        Myrunnable mr = new Myrunnable();

        Thread t1 = new Thread(mr, "Thread 1");
        Thread t2 = new Thread(mr, "Thread 2");
        Thread t3 = new Thread(mr, "Thread 3");

        t1.start();

        //Now let's wait for  t1 to die by using join()

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            //Let's waits for 1 second or T2 to die whichever occurs first
            t2.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        //Complete all thread before completing main thread
        try {
            t2.join();
            t3.join();

        } catch (
                InterruptedException m) {
            m.printStackTrace();

        }
        System.out.println("Main Thread execution ends");

    }
}
