public class loopsTest {
    public static void main(String[] args) {
        //for
        int resultFor=0;
        for(int i =0 ; i<5 ; i++){
            if(i%2 ==0){
                resultFor +=i;
            }

        }
        System.out.println("Loops");
        System.out.println("Result for for loop is "+resultFor);
        System.out.println("------------------------------");

        //while
        int j =10;
        int resultWhile=0;
        while(j>0){
            if(j%2==0){
                resultWhile +=j;
            }
         j--;
        }
        System.out.println("Result for while loop is "+resultWhile);
        System.out.println("------------------------------");
        //foreach
        int resutlForeach =0;
        int[] arr = {1,2,3,4,5};
        for(int k : arr){
            if(k % 2 == 0) {
                resutlForeach += k;
            }
        }
        System.out.println("Result for foreach loop is " +resutlForeach);
        System.out.println("------------------------------");
        //break and continue

    }
}
