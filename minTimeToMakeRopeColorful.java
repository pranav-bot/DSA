public class minTimeToMakeRopeColorful {
    public static void main(String[] args) {
        int[] neededTime = {1,2,3,4,5};
        String colors = "abaac"
        System.out.println("hello");
    }
    public static int minCost(String colors, int[] neededTime){
        char[] a = new char[colors.length()];
        for(int i=;i!=a.length;i++){
            a[i] = colors.charAt(i);
        }
        int cost = 0;
        for(int i=0;i!=a.length;i++){
            if(a[i]==a[i+1]){
                cost = cost+neededTime[i];
            }
        }
        return cost;
    }
}
