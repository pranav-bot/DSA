package GreatestCommonDivisiorOfStrings;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {

    }

    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            return (str1.substring(0, gcd(str1.length(), str2.length())));
        }
        return "";
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
