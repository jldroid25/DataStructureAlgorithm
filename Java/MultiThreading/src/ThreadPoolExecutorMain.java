import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorMain {

    //This Thread pool executor is to consume task from the FetchDataFromFile
    public static void main(String[] args) {

        //Getting instance of ThreadPoolExecutor using
        // Executors.newFixedThreadPool factory method
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++){
            FetchDataFromFile fetchDataFromFile = new FetchDataFromFile("File " + i);
            System.out.println("A new file has been added to read: " +
                    fetchDataFromFile.getFileName());

            //submitting Task to executor
            threadPoolExecutor.execute((Runnable)threadPoolExecutor);
        }
        threadPoolExecutor.shutdown();
    }
}
