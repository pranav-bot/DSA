public class findUnique {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,4,3,3,6};
        System.out.println(ans(arr));
        
    }
    public static int ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
    
}
