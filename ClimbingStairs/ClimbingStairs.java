package ClimbingStairs;

public class ClimbingStairs {
    public static void main(String[] args) {

    }

    public int ClimbingStairs(int n) {
        if (n == 1 || n == 2)
            return 1;
        return ClimbingStairs(n - 1) + ClimbingStairs(n - 2);
    }
}
