package Collections;


import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

    public static final String lineSeperator = "------------------------ ".replaceAll(" ", "\n");

    public static void main(String[] args) {
        //define an arraylist
        ArrayList<String> userList = new ArrayList<String>();

        //add all items in it
        Collections.addAll(userList, "Oğuzhan", "Samet");

        for(String users : userList) {
            System.out.println(users);
        }
        System.out.println(lineSeperator);
        System.out.println("Items after the second add operation");
        System.out.println(lineSeperator);
        userList.add("Mert");
        for(String users2 : userList) {
            System.out.println(users2);
        }
        System.out.println(lineSeperator);

        //add an item between 2 items(between Samet-Mert)
        System.out.println("add an item between 2 items(between Samet-Mert)");
        userList.add(userList.indexOf("Samet") + 1, "Between Samet and Mert");
        for(String users3 : userList) {
            System.out.println(users3);
        }
        System.out.println(lineSeperator);

        //remove an element from the arrayList using  indexOf
        System.out.println("remove an element from the arrayList using indexOf");
        userList.remove(0);
        for(String usersAftertheRemove1 : userList) {
            System.out.println(usersAftertheRemove1);
        }
        System.out.println(lineSeperator);

        //remove an element from the arraList using the object itself
        System.out.println("remove an element from the arraList using the object itself");
        userList.remove("Mert");
        for(String usersAftertheRemove2 : userList) {
            System.out.println(usersAftertheRemove2);
        }
        System.out.println(lineSeperator);
    }
}
