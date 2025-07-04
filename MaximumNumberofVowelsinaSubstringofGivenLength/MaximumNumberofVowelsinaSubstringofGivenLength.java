package MaximumNumberofVowelsinaSubstringofGivenLength;
public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;
        System.out.println(maxVowels2(s, k));
    }
    public static int maxVowels(String s, int k) {
        int max = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i <= s.length()-k; i++) {
            String sub = s.substring(i, i+k);
            int count = 0;
            for (int j = 0; j < sub.length(); j++) {
                for (int j2 = 0; j2 < vowels.length; j2++) {
                    if(vowels[j2]==sub.charAt(j)){
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }
        return max;  
    }
    public static int maxVowels2(String s, int k){
        int max = 0;
        int countV = 0 ;
        int r = 0;
        int l = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        while (r<s.length()) {
            for (int i = 0; i < vowels.length; i++) {
                if(s.charAt(r)==vowels[i]){
                    countV++;
                    break;
                }
            }
            while((r-l+1)>k){
                for (int i = 0; i < vowels.length; i++) {
                    if(s.charAt(l)==vowels[i]){
                        countV--;
                        break;
                    }
                }
                l++;
            }
            if((r-l+1)==k){
                max = Math.max(max, countV);
            }
            r++;
        }
        return max;
    }
}
