import java.util.Scanner;

public class bitpluplus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        for(int i=0;i!=n;i++){
            String str = in.next();
            if(str.equals("++X")|| str.equals("X++")){
                count++;
            }
            else if(str.equals("--X")|| str.equals("X--")){
                count--;
            }
        }
        System.out.println(count);
        in.close();
    }
}
