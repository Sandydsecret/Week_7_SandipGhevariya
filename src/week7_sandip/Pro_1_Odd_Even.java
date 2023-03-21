package week7_sandip;

//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner;

public class Pro_1_Odd_Even {
    public int Input() {                        // input for user

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        //System.out.println("Enter a number");
        //int num1 = scan.nextInt();
        scan.close();
        return num;

    }
    public void findOddEven(int num) {            // is number odd or even
        String msg = (num % 2 == 0) ? "Number is even" : "Number is odd";
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Pro_1_Odd_Even N = new Pro_1_Odd_Even();
        int num = N.Input();
        N.findOddEven(num);
    }

}
