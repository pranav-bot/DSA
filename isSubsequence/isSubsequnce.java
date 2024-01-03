package isSubsequence;

public class isSubsequnce {
    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return false;
        }
        if (t.equals("")) {
            return false;
        }
        boolean ans = false;
        int i = 0;
        int j = 0;
        while (i != t.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                if (j == s.length() - 1) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}
