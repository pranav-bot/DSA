import java.util.Scanner;

public class DAACCA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i != t; i++) {
            int N = in.nextInt();
            int xorS = 0;
            for (int j = 0; j != N; j++) {
                int d = in.nextInt();
                xorS ^= d;
            }
            System.out.println(xorS);
        }
        in.close();
    }
}
