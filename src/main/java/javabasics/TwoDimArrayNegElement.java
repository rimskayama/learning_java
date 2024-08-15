package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;

public class TwoDimArrayNegElement {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] arr = new int[scan.nextInt()][scan.nextInt()];
            Random rand = new Random(scan.nextInt());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = rand.nextInt(-10, 11);
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            int neg = -1;
            for (int[] ints : arr) {
                for (int j = 0; j < ints.length; j++) {
                    if (ints[j] < 0) {
                        neg = j;
                        break;
                    }
                }
                if (neg >= 0) {
                    System.out.println(neg);
                    neg = -1;
                } else System.out.println("NO");
            }

        }
    }
}
