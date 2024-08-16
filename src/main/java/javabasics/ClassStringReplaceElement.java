package src.main.java.javabasics;
import java.util.Scanner;

public class ClassStringReplaceElement {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String newstr = str.replace(";",".,");
            System.out.println(newstr);
        }
    }
}
