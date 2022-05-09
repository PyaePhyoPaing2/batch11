package controlflow;

//show janpanese year using ifstatement
//check here - https://www.jcb.co.jp/processing/share/wareki.html

import java.util.Scanner;
public class IfStatement_test {
public static void main(String[]args){

    System.out.println("Input over 1900year and don't need to input (year)" +
            ".it will be covert Janpanese year");

    Scanner sc = new Scanner(System.in);//input line
    int i = sc.nextInt();
if (i >=2019){
    System.out.println("janpanese year call => meiwa" + (i-2018)+" year");

            }else if(i >=1989){
    System.out.println("janpanese year call => heisei" + (i-1988)+" year");

            }else if(i >=1926){
    System.out.println("janpanese year call => showa" + (i-1925)+" year");

            }else if(i >=1912){
    System.out.println("janpanese year call => daisei" + (i-1912)+" year");

            }else if(i >=1897){
    System.out.println("janpanese year call => meiji" + (i-1896)+" year");

            }
}
}