public class ComparableMenuDemo  implements Comparable<ComparableMenuDemo>{

    int orderNumber;
    String dishName;

    public ComparableMenuDemo(int orderNumber, String dishName) {
        super();
        this.orderNumber = orderNumber;
        this.dishName = dishName;
    }

    //Here we must define CompareTo, It will be sorted by Id

    @Override
    public int compareTo(ComparableMenuDemo menuDemo) {
        return  (this.orderNumber < menuDemo.orderNumber) ? -1 :
                (this.orderNumber > menuDemo.orderNumber) ? 1: 0;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
}
