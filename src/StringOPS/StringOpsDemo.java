package StringOPS;


public class StringOpsDemo {
    public static final String lineSeperator = "------------------------ ".replaceAll(" ", "\n");

    public static void main(String[] args) {
        //Create chars array
        char chars [] = {'O','g','u','z'};
        //Print the array
        String s = new String(chars);
        //Print array by offset and count
        String s1 = new String (chars,1,3);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(lineSeperator);


        //Char at a given idex
        System.out.println(s.charAt(3));
        //Index of a given char
        System.out.println(s.indexOf("O"));

        System.out.println(lineSeperator);

        //Get Chars example
        // getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart)
        String line ="This is a demo of the getChars method";
        int sourceStart = 10;
        int sourceEnd = 15;
        char [] newLine = new char[sourceEnd-sourceStart];
        int targetStart = 0;


       line.getChars(15,20,newLine,targetStart);
        System.out.println(newLine);
        System.out.println(lineSeperator);
        System.out.println("byte to char");
        byte [] b = line.getBytes();

        System.out.println(lineSeperator);
        System.out.println();
        for(int i =0; i<b.length ; i++){
            char c = (char) b[i];
            System.out.println("index:"+i +" , byte:" +b[i]+ " ,character:"+c);
        }

        //String comparison
        //equals: Case sensitive, equalsIgnoreCase not!
        System.out.println(lineSeperator);

        String value1 = "OGUZ";
        String value2 = "Oguz";
        String value3 = "oguz";
        String value4 = "OGUZ";
        System.out.println(value1.equals(value2));
        System.out.println(value4.equals(value1));
        System.out.println(value1.equalsIgnoreCase(value2)  );
        System.out.println(value1.endsWith("Z") && value3.startsWith("O"));

        //equals for string comparison, == object comparison

        System.out.println(lineSeperator);
        String svalue = new String(value4);
        System.out.println("equals and  == operations");
        System.out.println(value1 == svalue);
        System.out.println(value1.equals(value4));
        System.out.println(lineSeperator);

        //Substrings

        String baseString ="Naber lan p";
        System.out.println(baseString);
        System.out.println(baseString.substring(3));
        System.out.println(baseString.substring(4,8));

        for(int i=0; i< baseString.length(); i++){
            System.out.println(baseString.substring(i).concat("11"));
        }
        double num = 12;
        String doubleNum = String.valueOf(num);
        System.out.println(doubleNum);

        String result = String.join(", " ,"ID","Username","Email","Department");
        System.out.println(result);
        System.out.println(lineSeperator);

        //Stringbuffer examples!!
        StringBuffer sb = new StringBuffer("Test11111");
        System.out.println("Length of the buffer is "+sb.length());
        System.out.println("Capacity of the buffer is "+sb.capacity());
        System.out.println(lineSeperator);

        //replace char
        String username = "Oguzhan.Unl..u";
        String usernameWODot = username.replace(".","");
        System.out.println(usernameWODot);


    }
}
