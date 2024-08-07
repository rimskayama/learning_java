package src.main.java.javabasics;
import java.util.Scanner;

class MathFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        double res = Math.log(num + 7 * Math.sqrt(Math.pow (num, 4.0) + Math.PI));
        System.out.printf("%.4f", res);
    }
}