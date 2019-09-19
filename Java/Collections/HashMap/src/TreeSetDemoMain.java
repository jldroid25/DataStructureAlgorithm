import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemoMain {

    public static void main(String[] args) {

        //Create some objects
        TreeSetDemo Isla = new TreeSetDemo("Isla");
        TreeSetDemo AprilRose = new TreeSetDemo("April rose");
        TreeSetDemo KeiraAble = new TreeSetDemo("Keira Abel");
        TreeSetDemo SashaJohanson = new TreeSetDemo("Sasha Johanson");
        TreeSetDemo AprilRose2 = new TreeSetDemo("April rose");

        //Add object in a Treeset

        TreeSet providerTreeset = new TreeSet();

        providerTreeset.add(Isla);
        providerTreeset.add(AprilRose);
        providerTreeset.add(KeiraAble);
        providerTreeset.add(SashaJohanson);
        providerTreeset.add(AprilRose2);




        /*
        Iterator countIter = providerTreeset.iterator();


        while (countIter.hasNext())

            System.out.println(countIter.next());

         */


    }
}
