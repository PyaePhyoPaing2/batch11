package com.codewall.calculator;



public class Logical_operator {
    public static void main(String[] args) {
         // and operator (&&)
        //  bitwise inclusive or operator (||)
        //  bitwise exclusive Or operator (^) if equal we wil get false
        //  true^false = true; false^true = true; true^true =false;

         boolean a = 3>4 && 4 < 5;
        boolean b = 3>4 || 4 < 5;
        System.out.println(a); // output => false
        System.out.println(b); // output => true

            // &  =>  0 & 0 = 0;
            // | => 0 & 1 = 1 ;
    }
}
