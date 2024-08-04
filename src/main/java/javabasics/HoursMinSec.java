package src.main.java.javabasics;
import java.util.Scanner;

class HoursMinSec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int hours = num / 3600;
        num -= hours * 3600;
        int min = num / 60;
        num -= min * 60;
        int sec = num;
        System.out.println(hours + " часов "+ min + " минут " + sec + " секунд");
    }
}