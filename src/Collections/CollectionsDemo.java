package Collections;


import java.util.ArrayList;
import java.util.Collections;
public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Oguzhan");
        listString.add("Turan");
        listString.add("UNLU");

        System.out.println(!listString.contains("Oguzhan"));
    }
}
