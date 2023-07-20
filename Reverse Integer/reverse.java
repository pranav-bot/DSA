import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverse(n));
        in.close();

    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev != 0 && (rev * 10) / rev != 10) {
                return 0;
            }
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        return rev;
    }

}
