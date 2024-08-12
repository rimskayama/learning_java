package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayMinMaxValue {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int l = scan.nextInt();
            int beg = scan.nextInt();
            Random rand = new Random(beg);
            double[] a = new double[l];
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextDouble(0, 2);
            }
            System.out.println(Arrays.toString(a));
            Arrays.sort(a);
            System.out.println(a[0] + a[a.length - 1]);
        }
    }
}
