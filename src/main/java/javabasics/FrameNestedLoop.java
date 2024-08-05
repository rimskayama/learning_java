package src.main.java.javabasics;
import java.util.Scanner;

public class FrameNestedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        if (height <= 0 || width <= 0) {
            System.out.println("ERROR");
        }
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}