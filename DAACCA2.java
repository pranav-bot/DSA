import java.util.Scanner;

class DAACCA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i != T; i++) {
            String s = in.next();
            int n = s.length();
            int pair = 0;
            for (int j = 0; j < n - 1; j++) {
                if ((s.charAt(j) == 'x' && s.charAt(j + 1) == 'y') || s.charAt(j) == 'y' && s.charAt(j + 1) == 'x') {
                    pair++;
                    j += 1;
                }
            }
            System.out.println(pair);
        }
        in.close();
    }
}