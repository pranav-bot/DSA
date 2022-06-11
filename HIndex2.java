public class HIndex2 {
    public static void main(String[] args) {
        int[] n = {0,1,3,5,6};
        System.out.println(hindex(n));
        
    }
    public static int hindex(int[] citations){
        int n=citations.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(citations[mid]==(n-mid)){
                return citations[mid];
            }
            else if(citations[mid]>(n-mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return n-start;
    }