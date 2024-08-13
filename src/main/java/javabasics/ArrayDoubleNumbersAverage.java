package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;

public class ArrayDoubleNumbersAverage {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int beg = sc.nextInt();
            Random rand = new Random(beg);
            double[] a = new double[num];
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextDouble(0, 5);
                sum += a[i];
                System.out.printf("%.2f", a[i]);
                System.out.print(" ");
            }
            System.out.println();
            double mid = sum / a.length;
            System.out.printf("%.2f", mid);
            System.out.println();
            for (int i = 0; i < a.length; i++) {
                if (a[i] > mid) {
                    a[i] = mid;
                }
                System.out.printf("%.2f", a[i]);
                System.out.print(" ");

            }
        }
    }


