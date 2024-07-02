package LongestRepeatingCharacterReplacement;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        
    }
    public int characterReplacement(String s, int k) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[26];
            int maxfreq = 0;
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j)-'A']++;
                maxfreq = Math.max(maxfreq, hash[s.charAt(j)-'A']);
                int changes = (j-i+1) -maxfreq;
                if(changes<=k){
                    max = Math.max(max, j-i+1);
                }
                else{
                    break;
                }
            }
        }    
        return max;
    }
    public int characterReplacement2(String s, int k) {
        int l  = 0;
        int r = 0;
        int max = 0;
        int maxf =  0;
        int[] hash = new int[26];
        while (r<s.length()) {
            hash[s.charAt(r)-'A']++;
            maxf =  Math.max(maxf, hash[s.charAt(r)-'A']);
            while ((r-l+1)-maxf>k) {
                hash[s.charAt(l)-'A']--;
                maxf = 0;
                for (int i = 0; i < hash.length; i++) {
                    maxf = Math.max(maxf, hash[i]);
                }
                l++;
            }
            if((r-l+1)-maxf<=k){
                max = Math.max(max, r-l+1);
            }
            r++;
        }
        return max;
    }
}
