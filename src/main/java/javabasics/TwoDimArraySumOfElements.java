package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;

public class TwoDimArraySumOfElements {
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
            System.out.println();
            for (int i = 0; i < arr[0].length; i++) {
                int sum = 0;
                for (int[] ints : arr) {
                    if (ints[i] > 0) {
                        sum += ints[i];
                    }
                }
                System.out.print(sum + " ");
            }


        }
    }
}
