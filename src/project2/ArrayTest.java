package project2;


import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 3 methods can build at arrays
       int  []number = new int[5];
       number[0]= 20;
       number[1]= 2450;
        number[2]= 2120;
        number[3]= 210;
        number[4]= 2010;
    // array method use .length
        System.out.println(number.length);

        //change int to string
        System.out.println(Arrays.toString(number));
      String [] heros = {"batman","superman","spiderman","antman"};

      //copy array
        int [] copyary = new int[3];
        // System.arraycopy(original array ,starting pos ,copyary , from , to);
        System.arraycopy(number,0,copyary,0,3);
        System.out.println(Arrays.toString(copyary));

      //check inside of arrays elements
        boolean checkarrayElement = Arrays.asList(heros).contains("batman");
        System.out.println(checkarrayElement);

      String[] index = new String[]{"barr","harr", "hyoo"};// array intilization methods
        System.out.println(heros[3]);
    }
}


