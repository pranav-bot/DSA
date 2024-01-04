package MinCostClimbingStairs;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {

        return Math.min(minCost(cost, cost.length - 1), minCost(cost, cost.length - 2));
    }

    public static int minCost(int[] cost, int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return cost[n];
        }
        return cost[n] + Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
    }

}
