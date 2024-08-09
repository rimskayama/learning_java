package src.main.java.javabasics;
import java.util.Scanner;

public class ChangeArrayElement {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int[] a = new int[num];
            for (int i = 0; i < num; i++) {
                int temp = scan.nextInt();
                a[i] = temp;
            }
            int min = a[0];
            int ind = 0;
            for (int j = 1; j < num; j++) {
                if (a[j] < min | a[j] == min) {
                    min = a[j];
                    ind = j;
                }
            }
            a[ind] = -1;
            for (int el:a) {
                System.out.print(el + " ");
            }
        }
}
