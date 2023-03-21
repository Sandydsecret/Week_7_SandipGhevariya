package week7_sandip;

import java.util.Scanner;

public class Pro_16_PositiveNegative {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Plz Enter a number .");
        int num = scan.nextInt();
        if(num > 0){
            System.out.println("Is +ve  number ");
        }else if (num < 0){
            System.out.println("is -ve number");
        } else  {
            System.out.println("is 0");
        }


    }
}