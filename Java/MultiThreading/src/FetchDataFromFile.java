import java.util.concurrent.TimeoutException;

public class FetchDataFromFile implements Runnable {

    //Class to treate a task -
    // Here task will be to read different files & process them

    private final  String fileName;

    public FetchDataFromFile(String fileName) {
        super();
        this.fileName = fileName;
    }

    @Override
    public void run() {

        try {
            System.out.println("Fetching data from " + fileName + " by " +
                     Thread.currentThread().getName());

            //Reading file
            Thread.sleep(5000);
            System.out.println("Read file Successfully: " +
                    fileName + " by " + Thread.currentThread().getName());

        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }

    public String getFileName(){
        return fileName;
    }
}
