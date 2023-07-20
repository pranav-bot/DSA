public class Pattern5 {
    public static void main(String[] args) {
        
    }
    void printTriangle(int n){
        char x = '*';
        for(int i=n;i!=0;i--){
            for(int j=i;j!=0;j--){
                System.out.print(x);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
