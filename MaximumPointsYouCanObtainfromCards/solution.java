package MaximumPointsYouCanObtainfromCards;

public class solution {
    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9};

        System.out.println(maxScore(arr, 7));
        
    }
    public static int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int lsum = 0;
        for (int i = 0; i < k; i++) {
            lsum +=cardPoints[i];
        }
        max = lsum;
        int r = cardPoints.length-1;
        int rsum = 0;
        for (int i = k-1; i >0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[r];
            r--;
            int sum = lsum+rsum;
            max = Math.max(max, sum);
        }
        return max;
    }
}
