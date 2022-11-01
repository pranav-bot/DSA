import java.util.Scanner;

public class dejaVu2 {
    public static void main(String[] args) {
        Scanner oj = new Scanner(System.in);
        int number = oj.nextInt();
        for(int k=0;k!=number;k++){
            String s = oj.next();
        String ss= s;
        char a= 'a';
        int c=0;
        String b="";
        if ( ss.matches("[a-zA-Z]+")){
        for (int i = 1; i <=s.length(); i++) {
            String t=ss.substring(0,i)+a+ss.substring(i);
            int n =t.length();
            for(int j = n - 1; j >= 0; j--)
            {
                 b = b + t.charAt(j);
            }
            if (b.equals(t))
                break;
            else{
                c=c+1;
                System.out.println("YES");
                System.out.println(t);
                break;
            }
        }
        if (c==0)
                System.out.println("NO");
        }
    }
        }
}
