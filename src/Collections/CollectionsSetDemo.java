package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionsSetDemo {
    public static final String lineSeperator = "------------------------ ".replaceAll(" ", "\n");

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Fenerbahce");
        hashSet.add("Galatasaray");
        hashSet.add("Besiktas");
        hashSet.add("Fenerbahce");
        hashSet.add(null);
        hashSet.add("Besiktas");

        System.out.println("Size of the hashset before deletion : " +hashSet.size());
        System.out.println("Hastset elements before deletion: ");

        for(String elements:hashSet){
            System.out.println(elements);
        }
        System.out.println(lineSeperator);


        System.out.println("Size of the hashset after deletion :" +hashSet.size());
        System.out.println("Hashset elements after deletion");
        for(String elements:hashSet){
            System.out.println(elements);
        }
        System.out.println(lineSeperator);

        System.out.println("Iterate with iterator not foreach");
        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(lineSeperator);

        System.out.println("Convert hashset to arraylist");
        List <String> teams = new ArrayList <String> (hashSet);

        System.out.println(teams.size());
        for (String team: teams) {
            System.out.println("Team:- " + team);
        }
        System.out.println(lineSeperator);

        //convert hashset to array
        // set the array size via using hash set's size
        System.out.println("Convert hashset to String array");
        String[] teamsArray = new String[hashSet.size()];
        hashSet.toArray(teamsArray);
        int counter=0 ;
        for(String team:teamsArray){
            counter++;
            System.out.println(counter+": "+team);
        }


    }
}
