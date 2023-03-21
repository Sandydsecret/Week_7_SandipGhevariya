package week7_sandip;

import java.util.Arrays;
//Write a Java program to sort a numeric array and a string array.

public class Pro_17_ArraySort {

        public static void main(String[] args) {
            Pro_17_ArraySort obj = new Pro_17_ArraySort();
            obj.sortArray();
        }

        public void sortArray(){

            int a[] = {5,10,35,25,55,65,85,75,95,100};
            String name[] = {"Dave", "Jacob", "Tom", "Chris", "Emma"};
            System.out.println("Original numeric array is: ");

            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

            System.out.println("Sorted numeric array is: ");
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

            System.out.println("Original string array is: ");
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i]);
            }
            System.out.println("Sorted string array is: ");
            Arrays.sort(name);
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i]);
            }

        }


    }


