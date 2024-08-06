package src.main.java.javabasics;
import java.util.Scanner;

public class HoursRateSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        double rate = sc.nextDouble();
        if (hours < 0 || rate < 0) {
            System.out.println("ERROR");
        } else {
            double result = salary(hours, rate);
            System.out.printf("%.2f\n", result);
        }
    }

    public static double salary(int hours, double rate) {
        double regularPay = Math.min(hours, 20) * rate;
        double overtimePay = Math.max(Math.min(hours - 20, 20), 0) * rate * 1.5;
        double doublePay = Math.max(hours - 40, 0) * rate * 2;

        return regularPay + overtimePay + doublePay;
    }
}