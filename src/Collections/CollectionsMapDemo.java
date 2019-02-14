package Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionsMapDemo {
    public static final String lineSeperator = "------------------------ ".replaceAll(" ", "\n");

    public static void main(String[] args) {
        HashMap<Integer,String> mapExample = new HashMap<Integer, String>();
        mapExample.put(1,"1. Person");
        mapExample.put(2,"2. Person");
        mapExample.put(3,"3. Person");
        mapExample.put(4,"4. Person");

        //use "key" to loop over
        // "value" can be used too
        // String valueX : map.values()
        for(int personKey : mapExample.keySet()){
           String personValue = mapExample.get(personKey);
            System.out.println(personKey+". user is found. Username is "+personValue);
        }
        System.out.println();
        System.out.println(lineSeperator);

        //iterate using entry
        System.out.println("Iterate using entry ");
       for(Map.Entry<Integer,String> personEntry : mapExample.entrySet()){
           Integer key = personEntry.getKey();
           String value = personEntry.getValue();
           System.out.println(key+"<<<>>>"+value);
       }
        System.out.println(mapExample.containsKey(2));

    }
}
