package src.main.java.javabasics;
import java.util.Scanner;

public class PrimeNumbersInRange {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int kol = simpleInRange(a, b);
            System.out.println(kol);
        }

        public static int simpleInRange(int a, int b) {
            if (a > b) {
                int c = b;
                b = a;
                a = c;
            }
            int count = 0; // prime
            for (int i = a; i <= b; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            return count;
        }
        public static boolean isPrime(int c)
        {
            if (c <= 0 | c == 1) {
                return false;
            }
            for (int j = 2; j * j <= c; j++) {
                if (c % j == 0) {
                    return false;
                }
            } return true;

        }
}
