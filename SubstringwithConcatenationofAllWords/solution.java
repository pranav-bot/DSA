package SubstringwithConcatenationofAllWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import topKfrequentElements.kFrequent;

public class solution {
    public static void main(String[] args) {
        String[] words2 = { "word", "good", "best", "good" };
        System.out.println(findSubstring("wordgoodgoodgoodbestword", words2));

        String[] words3 = { "bar", "foo", "the" };
        System.out.println(findSubstring("barfoofoobarthefoobarman", words3));
        String s = "a".repeat(1000); // 1000 'a's
        String[] words = new String[100];
        Arrays.fill(words, "a");
        System.out.println(findSubstring(s, words)); // Should return [0]

    }

    public static List<Integer> findSubstring(String s, String[] words) {
        
        int wordL = words[0].length();
        int subStringL = wordL * words.length;
        List<Integer> list = new ArrayList<>();

            Map<String, Integer> targetFreq = new HashMap<>();

            for (String word : words) {
                targetFreq.put(word, targetFreq.getOrDefault(word, 0) + 1);
            }

        for (int i = 0; i <= s.length() - subStringL; i++) {
            String subs = s.substring(i, i + subStringL);
            Map<String, Integer> seen = new HashMap<>();
            for (int j = 0; j < subStringL; j = j + wordL) {
                String subsubString = subs.substring(j, j + wordL);
                if (targetFreq.containsKey(subsubString)) {
                    seen.put(subsubString, seen.getOrDefault(subsubString, 0) + 1);
                    if (seen.get(subsubString) > targetFreq.get(subsubString)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if(seen.equals(targetFreq)){
                list.add(i);
            }

        }
        return list;
    }
}