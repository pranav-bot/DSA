import java.util.Scanner;


public class dejaVu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i!=n;i++){
            String s = in.next();
            String temp = s;
            boolean check = true;
            String ans="";
            for(int j=0;j!=s.length();j++){
                s = temp;
                String newString = addChar(s, 'a', j);
                String revNew = reverseString(newString);
                if(!newString.equals(revNew)){
                    check = false;
                }
                ans = newString;
            }
            if(check){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(ans);
            }
        }
    }
    public static String addChar(String str, char ch, int position) {
        int len = str.length();
        char[] updatedArr = new char[len + 1];
        str.getChars(0, position, updatedArr, 0);
        updatedArr[position] = ch;
        str.getChars(position, len, updatedArr, position + 1);
        return new String(updatedArr);
    }
    public static String reverseString(String str){
        String sum = "";
        char ch;
        for(int i=0; i<str.length(); i++){
            ch= str.charAt(i);

            sum= ch+sum; 
        }
        return sum;
    }
}
