package src.main.java.javabasics;
import java.util.Scanner;

class TriangleNestedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        if (height <= 0) {
            System.out.println("ERROR");
            return;
        }
        for (int i = height; i > 0; i--) {
            for (int s = 0; s < height - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}