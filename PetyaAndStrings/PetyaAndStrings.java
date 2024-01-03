package PetyaAndStrings;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.compareTo(b) == 0) {
            System.out.println("0");
        }
        if (a.compareTo(b) > 0) {
            System.out.println("1");
        }
        if (a.compareTo(b) < 0) {
            System.out.println("-1");
        }
        in.close();
    }

    public static String convertToUnicode(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            sb.append("\\u").append(Integer.toHexString((int) c));
        }

        return sb.toString();
    }
}
