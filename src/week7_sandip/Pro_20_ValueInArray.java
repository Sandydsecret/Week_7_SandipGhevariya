package week7_sandip;

import java.util.Scanner;

public class Pro_20_ValueInArray {
    public static void main(String[] args) {
        Pro_20_ValueInArray obj = new Pro_20_ValueInArray();
        obj.checkarray();
    }

    public void checkarray() {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean b = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        int value = scan.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (value == a[i]) {
                System.out.println("Array contains given number");
                b = true;
            }
        }
        if (!b){
                System.out.println("Array does not contains given number");
            }
        }
    }

