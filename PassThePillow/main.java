package PassThePillow;

public class main {
    public static void main(String[] args) {
        System.out.println(passThePillow(4, 5));
        
    }
    static int passThePillow(int n, int time) {
        int pos = 1;
        int dir = 1;

        while(time!=0){
            if(pos==n){
                dir = -1;
            }
            else if(pos=1){
                dir = 1;
            }
            pos+=dir;
            time --;
        }
        return pos;
        
    }
    
}
