package week7_sandip;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Pro_7_SaleData {
    public static void main(String[] args) {
        int saleid;
        String sellername;
        long salesamount;
        long salarybasic;
        double commision = 0;

        // public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter sale ID number : ");
        saleid = scan.nextInt();
        System.out.println("Please enter seller name : ");
        sellername = scan.next();
        System.out.println("Plese enter salesamount :");
        salesamount = scan.nextLong();
        System.out.println("Please enter basic salary");
        salarybasic = scan.nextLong();
        scan.close();


        if (salesamount >= 50000) {
            commision = 0.35 * salesamount;
        } else if (salesamount >= 30000) {
            commision = 0.20 * salesamount;
        } else if (salesamount >= 20000) {
            commision = 0.10 * salesamount;
        } else if (salesamount >= 10000) {
            commision = 0.05 * salesamount;
        } else if (salesamount < 10000) {
            commision = 0.02 * salesamount;
        }
        System.out.println(commision + " will be your commision ");

    }


}


