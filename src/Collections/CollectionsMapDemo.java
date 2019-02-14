package Collections;


import Classes.Box;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionsMapDemo {
    public static final String lineSeperator = "------------------------ ".replaceAll(" ", "\n");

    public static void main(String[] args) {
        //use iterator to modify the collection in loop
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
        System.out.println(lineSeperator);
       //Create map using Box objects
        System.out.println("Kutularrrrrrrrr");
       Box b1 = new Box(1,2,3);
       Box b2 = new Box(10,20,30);
       HashMap<String, Box> boxMap = new HashMap<String,Box>();
       boxMap.put("1. kutu",b1);
       boxMap.put("2. kutu",b2);

       for(Map.Entry<String,Box> boxEntry: boxMap.entrySet()){
           System.out.println(boxEntry.getValue().getHeight());
       }



    }
}
