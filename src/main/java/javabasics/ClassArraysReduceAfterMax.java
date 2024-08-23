package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ClassArraysReduceAfterMax {
    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] arr = new int[scan.nextInt()];
            long seed = scan.nextLong();
            init(arr, seed);
            print(arr);
            int[] b = reduceAfterMax(arr);
            print(b);
        }

        public static void init(int[] arr, long seed) {
            Random rand = new Random(seed);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(-3, 6);
            }
        }

        public static void print(int[] arr) {
            for (int el:arr) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        public static int findMax(int[] arr) {
            int max = arr[0];
            int maxind = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    maxind = i;
                    max = arr[i];
                }
            }
            return maxind;
        }
        public static int[] reduceAfterMax(int[] arr) {
            int maxind = findMax(arr);
            return Arrays.copyOfRange(arr, 0, maxind + 1);
        }
    }
}
