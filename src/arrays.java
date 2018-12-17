public class arrays {
    public static void main(String[] args) {
        //1D arrays
        // Display the days in order
        int i =0;
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        for (String day : days){

            i++;
            if(i==1 ) {
                System.out.println(i + "st day is " + day);

            }
            else if (i==2){
                System.out.println(i + "nd day is "+day);
            }
            else if (i==3) {
                System.out.println(i + "rd day is " + day);

            }
            else {
                System.out.println(i + "th day is " + day);

            }

        }


        //2D arrays
        //multipleD arrays
    }
}
