package SubstringwithConcatenationofAllWords;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution2 {
    public static void main(String[] args) {
        
    }
    public List<Integer> findSubstring(String s, String[] words) {
        int wordL = words[0].length();
        int subStringL = wordL*words.length;
        Map<String, Integer> targetFreq = new HashMap<>();
        
        for (int i = 0; i <= s.length()-subStringL; i++) {
            String subString = s.substring(i, i+subStringL);
            Map<String, Integer> seen = new HashMap<>();
            for (int j = i; j < subStringL; j+=wordL) {
                String subsubString = subString.substring(j, j+wordL-1);
                if(targetFreq.containsKey(subsubString)){
                    seen.put(subsubString, seen.getOrDefault(subsubString, 0)+1);
                }
                else{
                    break;
                }
            }
        }
    }
}
