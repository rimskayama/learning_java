package src.main.java.javabasics;
import java.util.Scanner;

class FindMinOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int max = a;
        if (b < max) {
            max = b;
        }
        if (c < max) {
            max = c;
        }
        if (d < max) {
            max = d;
        }
        if (e < max) {
            max = e;
        }
        System.out.println(max);
    }
}