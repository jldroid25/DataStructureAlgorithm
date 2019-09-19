public class Myrunnable  implements Runnable{


    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " Start");

            //Sleep in 4 seconds
            Thread.sleep(4000);

            System.out.println(Thread.currentThread().getName() + " end");

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
