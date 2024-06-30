package FindTheKBeautyOfANumber;

public class FindTheKBeautyOfANumber {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("04"));
        System.out.println(divisorSubstrings(3003, 2));
        System.out.println(divisorSubstrings2(240, 2));
        
    }
    public static int divisorSubstrings(int num, int k) {
        int max = 0;
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
           
            String t = "";
            for (int j = i; j < s.length(); j++) {
                t = t +s.charAt(j);
                if(t.length()!=k){
                    continue;
                }
                if( Integer.parseInt(t)!=0&&num%Integer.parseInt(t)==0 ){
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static int divisorSubstrings2(int num, int k){
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i <= s.length()-k; i++) {
            String t = s.substring(i, i+k);
            int x = Integer.parseInt(t);
            if(x!=0 && num%x==0)
            count++;
            
        }
        return count;
    }
}
