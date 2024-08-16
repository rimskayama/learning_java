package src.main.java.javabasics;
import java.util.Scanner;
import java.util.Arrays;

public class ClassStringSortArray {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String[] arr = new String[3];
            arr[0] = scan.nextLine();
            arr[1] = scan.nextLine();
            arr[2] = scan.nextLine();
            Arrays.sort(arr);

            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}
