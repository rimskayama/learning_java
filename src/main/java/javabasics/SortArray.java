package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SortArray {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int l = scan.nextInt();
            int beg = scan.nextInt();
            int k = scan.nextInt();
            int ind = -1;
            int a[] = new int[l];
            Random rand = new Random(beg);
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(2, 16);
            }

            Arrays.sort(a);
            System.out.println(Arrays.toString(a));

            for (int j = 0; j < a.length; j++) {
                if (a[j] == k) {
                    ind = j;
                }
            }

            if (ind == -1) {
                System.out.println("ERROR");
            } else {

                int[] d = Arrays.copyOfRange(a, 0, ind + 1);
                System.out.println(Arrays.toString(d));
            }
        }
    }
}
