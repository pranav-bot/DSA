package FindFirstPalindromicStringintheArray;

public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    } 
    public static String firstPalindrome(String[] words){
        for (String word : words) {
            int i=0;
            int j = word.length()-1;
            boolean flag = true;
            while (i!=word.length()-1 && j!=0) {
                if(word.charAt(i)!=word.charAt(j)){
                    flag=false;
                    break;
                }
                i++;
                j--;
            }
            if(flag==true){
                return word;
            }
        }
        return "";
    }
}
