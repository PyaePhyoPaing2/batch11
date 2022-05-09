package controlflow;


import java.util.Scanner;

public class Switch_Statement_test {
    public static void main(String[] args) {
        System.out.println("Input Weekdays with First capital Letter ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (s){
            case "Monday":
                System.out.println(s +" we call at janpanese language > getsu");
                break;
            case "Tuesday":
                System.out.println(s + " we call at janpanese language > Ka");
                break;
            case "Wednesday":
                System.out.println(s + " we call at janpanese language > Sui(Suei)");
                break;
            case "Thursday":
                System.out.println(s + " we call at janpanese language > Moku");
                break;
            case "Friday":
                System.out.println(s + " we call at janpanese language > kin");
                break;
            case "Saturday":
                System.out.println( s + " we call at janpanese language > do");
                break;
            case "Sunday":
                System.out.println(s + " we call at janpanese language Nichi");
                break;
            default:
                System.out.println("Check your input words");

        }
    }
}
