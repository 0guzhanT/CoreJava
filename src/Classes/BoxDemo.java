//Comparator is defined in Box.class and being used in BoxDemo.class!

package Classes;


import customlibs.MathMethods;

import java.util.ArrayList;
import java.util.Collections;

public class BoxDemo {
    public static final String lineSeperator = "------------------------ ".replaceAll(" ", "\n");
    public static void main(String[] args) {

        ArrayList<Box> boxArray = new ArrayList<Box>();
        boxArray.add(new Box(1,2,3));
        boxArray.add(new Box(100,200,300));
        boxArray.add(new Box(10,20,30));

        System.out.println("Measure of boxes");
        for(Box boxObject:boxArray){
            System.out.println(boxObject);
        }
        System.out.println(lineSeperator);
        System.out.println("Sorting the boxes");

        //Compare the objects
        Collections.sort(boxArray,Box.boxComparatorHeight);
        System.out.println(lineSeperator);
        System.out.println("Result after the sort operation");

        for(Box boxObject:boxArray){
            System.out.println(boxObject);
        }
        System.out.println(lineSeperator);

        System.out.println("Sort the boxes descending order");
        Collections.sort(boxArray, Box.boxComparatorHeightDesc);
        System.out.println("Result after the sort operation");
        for(Box boxObject:boxArray){
            System.out.println(boxObject);
        }
        System.out.println(lineSeperator);
    }
}
