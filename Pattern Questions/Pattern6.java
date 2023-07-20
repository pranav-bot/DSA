public class Pattern6 {
    public static void main(String[] args) {

    }

    void printTriangle(int n) {
        for (int i = n; i != 0; i--) {
            for (int j = 0; j != i; j++) {
                System.out.print(j + 1);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
