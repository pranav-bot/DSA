package LexicographicallySmallestPalindrome;

public class main {
    public static void main(String[] args) {
        String s = "seven";
        System.out.println( makeSmallestPalindrome(s));
        
    }
    public static String makeSmallestPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        StringBuilder ans = new StringBuilder(s);
        while(r>l){
            if(s.charAt(r)>s.charAt(l)){
                ans.setCharAt(r, s.charAt(l));
            }
            else if(s.charAt(r)<s.charAt(l)){
                ans.setCharAt(l, s.charAt(r));
            }
            l++;
            r--;
        }
        return ans.toString();
    }
    
}
