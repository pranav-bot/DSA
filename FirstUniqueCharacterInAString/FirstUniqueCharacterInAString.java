package FirstUniqueCharacterInAString;

public class FirstUniqueCharacterInAString {
   public static void main(String[] args) {
    System.out.println(firstUniqChar("loveleetcode"));
    
   }
   public static int firstUniqChar(String s) {
    int ans = -1;
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        ans = i;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j)==s.charAt(i) && j!=i){
                ans = -1;
                break;
            }
        }
        if(ans>-1){
            return ans;
        } 
    }
    return ans;
   } 
}
