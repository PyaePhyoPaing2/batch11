package project2;

public class Biwise_Test {
    public static void main(String[] args) {
        // test bitwise complement Operator
        // Declaring a variable
        int n1 = 3, n2 = -2;

        // Printing numbers on console
        System.out.println("First Number = " + n1);
        System.out.println("Second Number = " + n2);

        // Printing numbers on console after
        // performing bitwise complement
        System.out.println(
                n1 + "'s bitwise complement = " + ~n1);
        System.out.println(
                n2 + "'s bitwise complement = " + ~n2);
    }
}
