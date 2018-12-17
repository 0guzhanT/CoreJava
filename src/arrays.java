public class arrays {
    public static void main(String[] args) {
        //1D arrays
        // Display the days in order
        int i = 0;
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (String day : days) {

            i++;
            if (i == 1) {
                System.out.println(i + "st day is " + day);

            } else if (i == 2) {
                System.out.println(i + "nd day is " + day);
            } else if (i == 3) {
                System.out.println(i + "rd day is " + day);

            } else {
                System.out.println(i + "th day is " + day);

            }

        }
        System.out.println("------------------------------");

        System.out.println("2D Array Test");
        //2D arrays
        //int [a][b] "a" number of column, "b" number of row

        int twoDArray[][] = new int[5][3];

        int a, b, c = 0;

        for (a = 0; a < 5; a++) {
            for (b = 0; b < 3; b++) {
                twoDArray[a][b] = c;
                c++;
            }
        }

        for (a = 0; a < 5; a++) {
            for (b = 0; b < 3; b++) {
                System.out.print(twoDArray[a][b] + " ");

            }
            System.out.println();
        }
        System.out.println("------------------------------");


        //multipleD arrays
    }
}
