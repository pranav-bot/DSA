public class Pattern3 {
    public static void main(String[] args) {
        
    }
    public static void printTriangle(int n){
        for(int i=1;i!=n+1;i++){
            for(int j=1;j!=i+1;j++){
                System.out.print(j);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
