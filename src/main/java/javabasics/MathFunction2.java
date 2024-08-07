package src.main.java.javabasics;
import java.util.Scanner;

class MathFunction2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double x = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * a), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * a), 2);
        double y = 0.25 - 0.25 * Math.sin(2.5 * Math.PI - 8 * a);
        System.out.printf("%.5f %.5f", x, y);
    }
}