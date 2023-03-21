package week7_sandip;


import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Pro_8_CityName {
    public static void main(String[] args) {
        Pro_8_CityName obj = new Pro_8_CityName();
        obj.cityname();

    }
    public void cityname(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F");
        String n = scan.next();

        if (n.equals("A")){
            System.out.println("Aurat");
        } else if (n.equals("B")) {
            System.out.println("Burat");
        } else if (n.equals("C")) {
            System.out.println("Curat");
        } else if (n.equals("D")) {
            System.out.println("Durat");
        } else if (n.equals("E")) {
            System.out.println("Eurat");
        } else if (n.equals("F")){
            System.out.println("Furat");
        } else
            System.out.println("Invalid valid enter");{

        }

    }


}
