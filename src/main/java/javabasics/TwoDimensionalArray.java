package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;

public class TwoDimensionalArray {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] arr = new int[scan.nextInt()][scan.nextInt()];
            Random rand = new Random(scan.nextInt());
            for (int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = rand.nextInt(-5, 5);
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            int max = arr[0][0];
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    if (anInt >= max) {
                        max = anInt;
                    }
                }
            }
            int sum = 0;
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    if (anInt == max) {
                        sum += 1;
                    }
                }
            }
            System.out.println(max + " " + sum);
        }
    }
}
