package week7_sandip;

import java.util.Scanner;

public class Pro_2_LeapYear {
    /**In this program, we first create a Scanner object to take input from the user.
     * Then we prompt the user to enter a year and store the input in the year variable.

    *We then check if the year is a leap year by applying the rules for leap years:
     *If a year is divisible by 4, it is a leap year.
    *If a year is divisible by 100, it is not a leap year unless it is also divisible by 400.
    *If the year satisfies any of these conditions, then we set the isLeapYear variable to true.
     *Finally, we print out the result to the user, indicating whether the year is a leap year or not.
**/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}


