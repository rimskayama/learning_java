package src.main.java.javabasics;
import java.util.Scanner;

public class ClassStringIfIsGmailAddress {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if (isGMailAddress(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        public static boolean isGMailAddress(String str) {
            return str.endsWith("@gmail.com") && str.indexOf("@") == str.lastIndexOf("@");
        }
    }
}
