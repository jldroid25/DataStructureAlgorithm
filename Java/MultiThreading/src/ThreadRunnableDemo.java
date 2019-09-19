/*
      // The second way to create a Thread is By implementing Runnable interface
      - you need to implement Runnable interface & override public void run() method.

      -You need to instantiate the class, pass created object to Thread constructor

      - and call start method on thread object to execute thread as different threads.

    */

public class ThreadRunnableDemo implements Runnable {

    @Override
    public void run() {

        System.out.println("Thread is running");
    }
}
