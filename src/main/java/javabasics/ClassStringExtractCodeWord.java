package src.main.java.javabasics;
import java.util.Scanner;

public class ClassStringExtractCodeWord {
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = 3;
            String[] arr = new String[num];
            for (int i = 0; i < arr.length; i++) {
                String temp = scan.nextLine();
                arr[i] = temp;
            }
            String result = "";
            for (String s : arr) {
                int indexf = s.indexOf(";");
                int indexl = s.lastIndexOf(";");
                String newstr = s.substring(indexf + 1, indexl);
                result = result.concat(newstr);
            }
            System.out.println(result);
        }
    }
}
