public class Pattern4 {
    public static void main(String[] args) {
        
    }
    public static void printTriangle(int n){
        for(int i=1;i!=n+1;i++){
            for(int j=1;j!=i+1;j++){
                System.out.print(i);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
