package NumberofSubstringsContainingAllThreeCharacters;

public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String s = "aaacb";
        System.out.println(numberOfSubstrings(s));   
    }
    public static int numberOfSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[3];
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j)-'a'] = 1;
                if(hash[0]+hash[1]+hash[2]==3){
                    count += s.length()-j;
                    break;
                }
            }
        }
        return count;
    }
    public static int numberOfSubstrings2(String s) {
        int count = 0;
        int[] hash = {-1,-1,-1};
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a'] = i;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                count += (1+Math.min(hash[0], Math.min(hash[1], hash[2])));
            }
        }
        return count;
    }
}
