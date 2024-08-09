package src.main.java.javabasics;
import java.util.Scanner;

public class MaxNumberDivider {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int max = maxNumberDivider(a, b);
            System.out.println(max);
        }

        public static class DividerInfo {
            int count;
            int number;

            DividerInfo(int count, int number)
            {
                this.count = count;
                this.number = number;
            }
        }
        public static DividerInfo countDividers(int number) {
            int count = 0;
            for (int i = 1; i <= number; i++)
            {
                if (number % i == 0) {
                    count++;
                }
            }
            return new DividerInfo(count, number);
        }
        public static int maxNumberDivider(int a, int b) {
            if (a > b) {
                int c = a;
                a = b;
                b = c;
            }
            int max = 0;
            int result = 0;
            for (int j = a; j <= b; j++) {
                DividerInfo info = countDividers(j);
                if (info.count > max) {
                    max = info.count;
                    result = info.number;
                }
            }
            return result;
        }
}
