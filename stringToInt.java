public class stringToInt {
    public static void main(String[] args) {
        String s = "   -42";
        System.out.println(myAtoi(s));
        System.out.println(Integer.valueOf(s));
        String s2 = s.replace(" ", "");
        System.out.println(s2);
        
    }
    public static int myAtoi(String s) {
        String s2 = s.replace(" ", "");
        int num=0;
        int pos =1;
        for(int i=s2.length()-1;i>=0;i--){
            if(s2.charAt(i)=='-'){
                num = num*-1;
                continue;
            }
            num+= (s2.charAt(i)-'0')*pos;
            pos*=10;
 
        }
        return num;
 
    }
 
}
    

