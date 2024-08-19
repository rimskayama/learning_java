package src.main.java.javabasics;
import java.util.Scanner;

public class ClassStringDeleteCom {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(delCom(str));
        }
        public static String delCom(String str) {
            if (str.endsWith(".com")) {
                int ind = str.lastIndexOf(".");
                String newstr = str.substring(0, ind);
                return newstr;
            }
            return str;
        }
    }
}
