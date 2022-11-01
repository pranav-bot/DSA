import java.util.Scanner;

public class wayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i!=n;i++){
            String str = in.next();
            if(str.length()>10){
                char start = str.charAt(0);
                char end = str.charAt(str.length()-1);
                int len = str.length()-2;
                System.out.println(""+start+len+end);
            }
            else{
                System.out.println(str);
            }
        }
        in.close();
    }
}
