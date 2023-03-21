package week7_sandip;
import java.util.Scanner;
public class Pro_3_StudentResult {



        String sname;
        int rollno = 10;
        int maths;
        int science;
        int english;
        double total;
        double percentage;
        String result;
        String grade;

        public static void main(String[] args) {
            Pro_3_StudentResult obj = new Pro_3_StudentResult();
            obj.studentResult();
            obj.printmarksheet();
        }

        public void studentResult() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Students name: ");
            sname = scan.next();
            System.out.println("Enter Roll No. : ");
            rollno = scan.nextInt();
            System.out.println("Enter Maths marks: ");
            maths = scan.nextInt();
            System.out.println("Enter Science marks: ");
            science = scan.nextInt();
            System.out.println("Enter English marks: ");
            english = scan.nextInt();
            scan.close();

            if (maths < 0 || maths > 100) {
                System.out.println("Invalid Input, marks should be between 0 to 100");
            }
            if (science < 0 || science > 100) {
                System.out.println("Invalid Input, marks should be between 0 to 100");
            }
            if (english < 0 || english > 100) {
                System.out.println("Invalid Input, marks should be between 0 to 100");
            }

            total = maths + english + science;
            percentage = (total / 300) * 100;

            if (percentage >= 35) {
                result = "Pass";

            } else {

                result = "Fail";
            }


            if (percentage < 35) {
                grade = "F";
            }
            if (percentage >= 35) {
                grade = "C";
            }
            if (percentage >= 50) {
                grade = "B";
            }
            if (percentage >= 60) {
                grade = "A";
            }
            if (percentage >= 80) {
                grade = "A+";
            }

        }

        public void printmarksheet() {

            System.out.println("_______________________________________");
            System.out.println("|                                     |");
            System.out.println("|             Mark Sheet              |");
            System.out.println("|                                     |");
            System.out.println("|         Name:      " + sname + "         |");
            System.out.println("|      Roll No:      " + rollno + "               |");
            System.out.println("|-------------------------------------|");
            System.out.println("|     Subjects:          Marks        |");
            System.out.println("|-------------------------------------|");
            System.out.println("|        Maths:      " + maths + "               |");
            System.out.println("|      English:      " + english + "               |");
            System.out.println("|      Science:      " + science + "               |");
            System.out.println("|-------------------------------------|");
            System.out.println("|        Total:      " + total + "            |");
            System.out.println("|-------------------------------------|");
            System.out.println("|   Percentage:      " + percentage + "             |");
            System.out.println("|       Result:      " + result + "             |");
            System.out.println("|        Grade:      " + grade + "                |");
            System.out.println("|-------------------------------------|");


        }

    }

