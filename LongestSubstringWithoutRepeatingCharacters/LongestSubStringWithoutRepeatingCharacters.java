package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));   
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[256];
            for (int j = i; j < s.length(); j++) {
                if(hash[s.charAt(j)]==1){
                    break;
                }
                else if(hash[s.charAt(j)]==0){
                    max = Math.max(max, j-i+1);
                    hash[s.charAt(j)] = 1;
                }
            }
        } 
        return max;  
    }
    public static int lengthOfLongestSubstring2(String s) {
        int max = 0;
        int l = 0;
        int r = 0;
        int[] hash = new int[256];
        for (int i : hash) {
            i = -1;
        }
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l = hash[s.charAt(r)]+1;
                }
            }
            max = Math.max(max, r-l+1);
            hash[s.charAt(r)] = r;
            r++;
        }
        return max;
    }
    
        public static int lengthOfLongestSubstring3(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        HashSet<Character> hash = new HashSet<>();
        while(r<s.length()){
            while (hash.contains(s.charAt(r))) {
                hash.remove(s.charAt(l));
                l++;
            }
            hash.add(s.charAt(r));
            max = Math.max(0, r-l+1);
        }
        return max;
    }
    
    
}
