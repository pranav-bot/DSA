public class validPalindrome {
    public static void main(String[] args) {
        String s = "OP";
        System.out.println(isPalindrome(s));
        
    }
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i!=str.length();i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z')|| str.charAt(i)>='A' && str.charAt(i)<='Z'){
                sb.append(str.charAt(i));
            }
        }
        str = sb+"";
        int start =0;
        int end = str.length()-1;
        while(start<=end){
            if(sb.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
    
}
