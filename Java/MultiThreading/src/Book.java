public class Book {

    // POJO for the wait(), notify(), & notifyAll() methods

    String title;
    boolean isCompleted;

    public Book(String title){
        super();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
