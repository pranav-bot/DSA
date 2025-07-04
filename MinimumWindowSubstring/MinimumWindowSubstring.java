package MinimumWindowSubstring;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        
    }
    public String minWindow(String s, String t) {
        int minL = Integer.MAX_VALUE;
        HashMap<Character, Integer> hasht = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hasht.put(t.charAt(i), hasht.getOrDefault(t.charAt(i),0)+1);
        }   
        int r = 0 ;
        int l = 0 ;
        int count = 0;
        int si = -1;
        while (r<s.length()) {
            if(hasht.getOrDefault(s.charAt(r), 0)>0){
                count++;
            }
            hasht.put(s.charAt(r), hasht.getOrDefault(s.charAt(r), 0)-1);
            while (count==t.length()) {
                if(r-l+1<minL){
                    minL = r-l+1;
                    si = l;
                }
                hasht.put(s.charAt(l), hasht.get(s.charAt(l))+1);
                if(hasht.get(s.charAt(l))>0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return si==-1 ? "" : s.substring(si, si+minL);
    }
}
