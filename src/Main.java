public class Main {
    //Testing the 2d arrays  12.22.18
    public static void main(String[] args) {


        int firstArray[] = {10, 20, 30, 40, 50};
        int[] secondArray = new int[5];

        for (int i = 0; i < firstArray.length; i++) {
             secondArray[i]= firstArray[i];
        }
        System.out.println(java.util.Arrays.toString(secondArray));

        System.out.println(java.util.Arrays.toString(firstArray));

    }
}
