import java.util.ArrayList;
import java.util.List;

public class checkIfTwoArraysareEquivalent {
    public static void main(String[] args) {
        String[] word1 = { "ab", "cd" };
        String[] word2 = { "ab", "cd" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String Word1 = "";
        for (int i = 0; i != word1.length; i++) {
            Word1 = Word1 + word1[i];
        }
        String Word2 = "";
        for (int i = 0; i != word2.length; i++) {
            Word2 = Word2 + word2[i];
        }
        return Word1.equals(Word2);

    }

}
