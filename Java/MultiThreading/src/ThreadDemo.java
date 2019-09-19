
/*
Thread can be called as light weight process.
Java supports multithreading , so it allows your application
to perform two or more task concurrently.

 Multithreading can be of advantage specially when now a days,
 machine has multiple CPUs, so multiple tasks can be executed concurrently.

 So if we want to create more threads to execute task concurrently ,
 we can use multiThreading. Thread can be created in two ways.

    1-By extending Thread class
    You can create your own thread by extending Thread class and override run method.
    You need to create object of that class
    and then call start() method on it to execute thread as different threads.

 */
public class ThreadDemo  extends Thread{

    //now override the run()
    public void run(){
        System.out.println("Thread is Running");
    }

}
