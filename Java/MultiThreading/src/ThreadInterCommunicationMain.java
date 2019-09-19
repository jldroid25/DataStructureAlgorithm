public class ThreadInterCommunicationMain {

    public static void main(String[] args) {

        //Book object on which wait and notify method will be called
        Book book = new Book("The Selfish Gene");

        BookReader johnReader = new BookReader(book);

        BookReader jamesReader = new BookReader(book);

        //Book reader threads will wait for completion of book
        Thread johnThread = new Thread(johnReader, "John");
        Thread jamesThread = new Thread(jamesReader, " James");

        jamesThread.start();
        johnThread.start();

        //To ensure both readers started waiting for the book
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        //BookWriter thread which will notify once book get completed
        BookWriter bookWriter = new BookWriter(book);

        Thread bookWriterThread = new Thread(bookWriter);
        bookWriterThread.start();
    }
}
