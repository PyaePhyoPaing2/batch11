package project2;

public class Multi_Array {

    public static void main(String[] args) {
    // multi dimensional array now test 2 dimensional array
        // first [] =>parents bracket ,second [] => child bracket
    String [][] number = {
                {"one", "two","three"},// row 0 0 = one , row 0 1 = two ,row 0 2 = three
            {"four","five","six"},// row 1 0 = four , row 1 1 = five
            {"seven","eight","nine"}
        };
        System.out.println(number[2][0]); // output seven
        System.out.println(number[1][2]);// output six
            // three multi array
        int [][] num = {
                {1,2,3,4,5,6},
                {7,8,9,10,11},
                {12,13,14,15,16}
        };
        System.out.println(num[1][3]);//output 10
}
  }

