package ScoreAString;

public class ScoreAString {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        
    }
    public static int scoreOfString(String s){
        int ans =  0;
        for(int i=0;i<s.length()-1;i++){
            ans = ans +  Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return ans;
    }
}
