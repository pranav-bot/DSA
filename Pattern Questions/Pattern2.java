public class Pattern2 {
    public static void main(String[] args) {

    }

    public static void printTriangle(int n) {
        char x = '*';
        for (int i = 0; i != n; i++) {
            for (int j = 0; j != i + 1; j++) {
                System.out.print(x);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
