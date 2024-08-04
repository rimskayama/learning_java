package src.main.java.javabasics;
import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (d1 > d2) {
            System.out.println("Вторая точка ближе");
        } else
        if (d1 < d2) {
            System.out.println("Первая точка ближе");
        } else {
            System.out.println("Точки на равных расстояниях");
        }
    }
}