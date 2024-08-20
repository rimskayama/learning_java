package src.main.java.javabasics;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ClassArraysDeleteRow {

    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] arr = new int[scan.nextInt()][scan.nextInt()];
            long seed = scan.nextLong();
            int ind = scan.nextInt();
            initArray(arr, seed);
            printArray(arr);
            System.out.println();
            arr = deleteRow(arr, ind);
            printArray(arr);
        }

        public static void initArray (int[][] arr, long seed) {
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
        public static int[][] deleteRow(int[][] arr, int ind) {
            if (ind < 0 | ind >= arr.length) {
                return arr;
            }
            int[][] newarr = new int[arr.length - 1][];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != ind) {
                    newarr[j++] = Arrays.copyOf(arr[i], arr[i].length);
                }
            }
            return newarr;
        }
    }

}
