package src.main.java.javabasics;
import java.util.Scanner;

public class PrintDivider {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            printDivider(number);
        }
        public static void printDivider(int number) {
            for (int i = 1; i <= number; i++) {
                if(number % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
}
