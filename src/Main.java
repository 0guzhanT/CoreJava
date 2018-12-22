public class Main {
    //Testing the 2d arrays  12.22.18
    public static void main(String[] args) {
        // 12-17-18 00.23 PM (GMT +3 Turkey)
      /*byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        result = + (i / c) ;*/




        //Create and array and Assign the elements to it
        int [][] values = new int [4][4];
        values[0][0] = 1;
        values [1][1] = 2;
        values [2][2] = 3;
        values [3][3] = 4;


        System.out.println("lenght of the values is : "+values.length);
        //loop over the array and iterate on inner arrays
        for(int i =0; i< values.length; i++){
            int[] innerArray = values[i];
            for (int x =0 ; x<innerArray.length; x++){

                System.out.print(innerArray[x] );

            }

            System.out.println();

        }




    }
}
