package week7_sandip;

import java.util.Scanner;

public class Pro_10_Symbol {
    int num1;
    int num2;
    char op;

    public static void main(String[] args) {
        Pro_10_Symbol obj = new Pro_10_Symbol();
        obj.operation();
    }

    public Pro_10_Symbol() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        num1 = s.nextInt();
        System.out.println("Please enter second number: ");
        num2 = s.nextInt();
        System.out.println("Please select any operator from(+, -, /, *): ");
        op = s.next().charAt(0);
        s.close();
    }

    public void operation() {
        //
        if (op == '+') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 - num2));
        } else if (op == '/') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 / num2));
        } else if (op == '*') {
            System.out.println("The result of " + num1 + op + num2 + ": " + (num1 * num2));
        } else {
            System.out.println("Invalid operator");
        }
    }


}
