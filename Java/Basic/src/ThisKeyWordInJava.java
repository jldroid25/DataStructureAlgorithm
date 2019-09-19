public class ThisKeyWordInJava {

    /*
    this keyword in java is used to refer to current object or instance of class.
    It can be used in constructor to call any other overloaded constructor
    but this keyword should be the first statement in the constructor.
     */

    String model;
    int cost;

    //Here we're using the this keyword to set values for class
    //Instance variables
    public ThisKeyWordInJava(String model, int cost){
        this.model = model;
        this.cost = cost;
    }

    public void workingOnassignment(){
        // working on assignment
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ThisKeyWordInJava getThisKeyWord(){
        return this;
    }

    public static void main(String[] args) {
        ThisKeyWordInJava e1 = new ThisKeyWordInJava("Tesla", 38990);
        System.out.println("Vehicle's Model: " + e1.model);
        System.out.println("Vehicle's Cost: " + e1.cost);

        System.out.println();

        ThisKeyWordInJava e2 = new ThisKeyWordInJava("Porsche", 180000);
        ThisKeyWordInJava e2Copy = e2.getThisKeyWord();
        System.out.println("Vehicle's Model: " + e2Copy.model);
        System.out.println("Vehicle's Cost: " + e2Copy.cost);
    }
}
