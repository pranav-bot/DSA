import java.util.Arrays;

public class iter{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(funct(201)));
        int[] b= new int[5];
        System.out.println(Arrays.toString(b));
        
    }
    public static int[] funct(int n){
        int[] a = new int[n];
        for(int i=1;i!=a.length;i++){
           if(i==1){
            if(a[i]==0){
                a[i]=1;
            }
            if(a[i]==1){
                a[i]=0;
            }
           }
            if(i%2==0|| i!=1){
                if(a[i]==0){
                    a[i]=1;
                }
                if(a[i]==1){
                    a[i]=0;
                }
            }
            if(i%3==0|| i!=0){
                if(a[i]==0){
                    a[i]=1;
                }
                if(a[i]==1){
                    a[i]=0;
                }
            }
            if(i%200==0||i!=0){
                if(a[i]==0){
                    a[i]=1;
                }
                if(a[i]==1){
                    a[i]=0;
                }
            }
        }
        return a;
    }
}