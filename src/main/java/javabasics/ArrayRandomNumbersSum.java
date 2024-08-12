package src.main.java.javabasics;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandomNumbersSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int beg = sc.nextInt();
            Random rand = new Random(beg);

            // new array
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(-5, 6);
                System.out.print(a[i] + " ");
            }
            //sum
            int sum = 0;
            for (int el:a) {
                if (el > 0) {
                    sum += el;
                }
            }
            //product
            double prod = 1;
            for (int el:a) {
                if (el < 0) {
                    prod *= el;
                }
            }

            System.out.println();
            System.out.print(sum);
            System.out.println(" " + prod);
        }
    }
