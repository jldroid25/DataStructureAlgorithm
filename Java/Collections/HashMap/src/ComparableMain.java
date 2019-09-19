import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

    public static void main(String[] args) {

        ComparableMenuDemo LukeLobstor = new ComparableMenuDemo(2, "New England Chowder");
        ComparableMenuDemo SansCulotte = new ComparableMenuDemo(4, "Scallop");
        ComparableMenuDemo hotBuns = new ComparableMenuDemo(1, "tightP");
        ComparableMenuDemo CanPuss = new ComparableMenuDemo(3, "CNC");

        List dishMenuList = new ArrayList();

        dishMenuList.add(LukeLobstor);
        dishMenuList.add(SansCulotte);
        dishMenuList.add(hotBuns);
        dishMenuList.add(CanPuss);

        //sort it
        Collections.sort(dishMenuList);

        for (int i = 0; i < dishMenuList.size(); i++){

            ComparableMenuDemo comparableMenuDemo = (ComparableMenuDemo) dishMenuList.get(i);

            System.out.println(" Dish by Order Number:" + comparableMenuDemo.getOrderNumber() +
                    " Dish name: " + comparableMenuDemo.getDishName());
        }



    }
}
