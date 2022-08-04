public class patterQuestions {
    public static void main(String[] args) {
        pattern1(5);

    }
    public static void pattern1(int n){
    for(int row =1;row<=n;row++){
        for(int k=row;k<=n-row+1;k++){
            System.out.print("* ");
        }
        for(int col=1;col<=row;col++){
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
}
