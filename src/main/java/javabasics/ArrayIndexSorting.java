package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayIndexSorting {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int l = scan.nextInt();
            int beg = scan.nextInt();
            Random rand = new Random(beg);
            int[] a = new int[l];
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(10, 21);
            }

            System.out.println(Arrays.toString(a));

            int c = scan.nextInt();
            int b = scan.nextInt();
            Arrays.sort(a, c, b+1);
            System.out.println(Arrays.toString(a));
        }
    }
}
