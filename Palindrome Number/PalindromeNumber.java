
public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int rev = 0;
        while (y != 0) {
            if (rev > Integer.MAX_VALUE / 10) {
                return false;
            }
            rev = rev * 10 + (y % 10);
            y /= 10;
        }
        return rev == x;
    }
}
