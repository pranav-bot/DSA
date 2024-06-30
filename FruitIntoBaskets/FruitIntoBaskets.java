package FruitIntoBaskets;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {0,1,6,6,4,4,6};
        System.out.println(totalFruit(fruits));
        
    }
    public static int totalFruit(int[] fruits) {
        if(fruits.length<=2){
            return fruits.length;
        }
        int[] currType = new int[2];
        currType[0] = fruits[0];
        int i=0;
        while(i<fruits.length){
            if(fruits[i]!=currType[0]){
                currType[1] = fruits[i];
                break;
            }
            i++;
        }
        int r = 0;
        int l = 0;
        int maxlen = 0;
        while(r<fruits.length){
            if(fruits[r]!=currType[0] && fruits[r]!=currType[1]){
               if(fruits[l]==currType[0] || fruits[l]==currType[1]) {
                l = r-1;
                int j =l-1;
                while(j!=0){
                    if(fruits[l]==fruits[j]){
                        l = j;
                    }
                    else{
                        break;
                    }
                    j--;
                }
               }
               if(fruits[l]==currType[0]){
                currType[1] = fruits[r];
                }
                else if (fruits[l]==currType[1]) {
                    currType[0] = fruits[r];
                }
            }
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }   
        return maxlen;
    }
}
