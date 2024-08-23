package src.main.java.javabasics;
import java.util.Scanner;

public class ClassStringFindMaxLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();

        String[] arr = str.split(" ");

        String result = "";
        int max = 0;

        for (String word : arr) {
            if (word.length() > max) {
                max = word.length();
                result = word;
            }
        }
        System.out.println(result);
    }
}
