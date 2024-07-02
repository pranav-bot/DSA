package MaximumPointsYouCanObtainfromCards;

public class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args) {
        int[] cardPoints =  {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));

    }
    public static int maxScore(int[] cardPoints, int k){
      int max = 0;
      int lsum = 0;
      int rsum = 0;
      for (int i = 0; i < k; i++) {
        lsum += cardPoints[i];
      }
      max = lsum;
      int rindex = cardPoints.length-1;
      for (int i = k-1; i >= 0; i--) {
        lsum -= cardPoints[i];
        rsum += cardPoints[rindex];
        rindex--;
        max = Math.max(max, lsum+rsum);
      }
      return max;
    }
}
