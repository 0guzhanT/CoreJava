package Collections;


import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

    public static final String lineSeperator = "------------------------ ".replaceAll(" ", "\n");

    public static void main(String[] args) {

        // create a list contains country names
        ArrayList<String> countryList = new ArrayList<String>();
        countryList.add("Turkey");
        countryList.add("Belgium");
        countryList.add("Denmark");
        countryList.add("Greece");
        countryList.add("USA");
        countryList.add("China");
        countryList.add("Japan");
        countryList.add("Brasil");

        //Print the list
        for(String countries:countryList){
            System.out.println(countries);
        }
        System.out.println(lineSeperator);

        //Sort, then print the list
        System.out.println("Lets sort the countries");
        Collections.sort(countryList);
        for(String countries:countryList){
            System.out.println(countries);
        }
        System.out.println(lineSeperator);

        //Reverse sorting Z-> A  , n ->1
        System.out.println("Lets sort them reverse order");
        Collections.reverse(countryList);
        for(String countries:countryList){
            System.out.println(countries);
        }
        System.out.println(lineSeperator);


    }
   /* public static void main(String[] args) {
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

        //edit an object
        System.out.println("The object is "+userList.get(0));
        System.out.println("Edit the " +userList.indexOf("Samet")+ "th object");
        System.out.println("Samet =>> Oguz");
        userList.set(0,"Oguz");
        System.out.println("The object is now " +userList.get(0));
        System.out.println(lineSeperator);

        //iterate the new arraylist
        for(String users:userList){
            System.out.println(users);
        }
        System.out.println(lineSeperator);

        //remove all object from the arraylist
        System.out.println("Number of items in arraylist before clear() is "+userList.size());
        userList.clear();
        System.out.println("Number of items in arraylist is after clear() is " +userList.size());

    }*/
}
