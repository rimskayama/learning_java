package src.main.java.javabasics;
import java.util.Scanner;

public class PrimeNumber {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           for (int i = 0; i < 5; i++) {
               int number = scan.nextInt();
               System.out.print(isPrime(number) + " ");
            }
        }
        public static boolean isPrime(int a) {
            int b = 0;
            if( a == 0 | a == 1) {
                return false;
            }
            for (int j = 1; j < a + 1; j++) {
                if (a % j == 0) {
                    b += 1;
                }
            }
            return b == 2;
        }
}
