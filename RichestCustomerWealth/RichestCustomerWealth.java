//The logic here is to take a matrix of AxB
//Then find the sum of all the elements in each row
//And return the maximum value of sum of all the elements of ea
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] account = new int[x][y];
        for (int row = 0; row != account.length; row++) {
            for (int col = 0; col != y; col++) {
                account[row][col] = in.nextInt();
            }
        }
        System.out.println(richest(account));

    }
    static int richest(int[][] nums){
        int max=0;
        for (int row = 0; row != nums.length; row++) {
            int sum=0;
            for (int col = 0; col != nums[row].length; col++) {
                sum=sum+nums[row][col];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}