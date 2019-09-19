public class DemonThreadDemo  implements  Runnable{

    /*
    --Daemon thread in java with example

    Daemon threads are low priority background threads which provide
    services to user threads.
    It’s life depends on user threads.
    If no user thread is running then JVM can exit
    even if daemon threads are running.
    JVM do not wait for daemon threads to finish.

    Daemon threads perform background tasks such as garbage collection, finalizer  etc.


     */

    @Override
    public void run() {

        if (Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName() +
                    " is a Deamon Thread");
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " is a user Thread");
        }
    }

    public static void main(String[] args) {

        DemonThreadDemo dt = new DemonThreadDemo();

        Thread thread1 = new Thread(dt, "Thread 1");
        Thread thread2 = new Thread(dt, "Thread 2");
        Thread thread3 = new Thread(dt, "Thread 3");

        //Making thread 2 a daemon thread
        thread2.setDaemon(true);

        //Start all the thread
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
