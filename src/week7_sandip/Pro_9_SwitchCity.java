package week7_sandip;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 * Same as above program-8 using switch statement.
 */

public class Pro_9_SwitchCity {

    public static void main(String[] args) {
        Pro_9_SwitchCity obj = new Pro_9_SwitchCity();
        char city = obj.getCity();
        obj.displayCityName(city);

    }

    public char getCity() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F");
        char city = scan.next().charAt(0);
        scan.close();
        return city;
    }

    public void displayCityName(char city) {


        switch (city) {
            case 'A':
                System.out.println("Aurat");
                break;
            case 'b':
                System.out.println("Burat");
                break;
            case 'c':
                System.out.println("Curat");
                break;
            case 'd':
                System.out.println("Durat");
                break;
            case 'e':
                System.out.println("Eurat");
                break;
            case 'f':
                System.out.println("Furat");
                break;
            default:
                System.out.println("Invalid city name ");
                break;


        }


    }
}
