package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;

public class ClassArraysFindMaxInRow {

    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] arr = new int[scan.nextInt()][scan.nextInt()];
            long seed = scan.nextLong();
            initArray(arr, seed);
            printArray(arr);
            System.out.println();
            printMaxIndex(arr);
        }

        public static void initArray(int[][] arr, long seed) {
            Random rand = new Random(seed);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = rand.nextInt(0, 11);
                }
            }
        }

        public static void printArray(int[][] arr) {
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    System.out.print(anInt + "\t");
                }
                System.out.println();
            }
        }

        public static void printMaxIndex (int[][] arr) {
            for (int[] ints : arr) {
                int maxind = 0;
                int max = ints[0];
                for (int j = 0; j < ints.length; j++) {
                    if (ints[j] > max) {
                        max = ints[j];
                        maxind = j;
                    }
                }
                System.out.print(maxind + " ");

            }

        }

    }
}
