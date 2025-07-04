package MinimumConsecutiveCardstoPickUp;

import java.util.HashMap;

public class MinimumConsecutiveCardstoPickUp {
    public static void main(String[] args) {
        
    }
    public int minimumCardPickup(int[] cards) {
        int minL =  Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int j = i; j < cards.length; j++) {
                hash.put(cards[j], hash.getOrDefault(cards[j], 0)+1);
                if(hash.get(cards[j])>1){
                    minL =   Math.min(minL, j-i+1);
                }
            }
        }    
        return minL==Integer.MAX_VALUE?-1:minL;
    }
}
