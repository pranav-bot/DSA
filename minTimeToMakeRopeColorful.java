public class minTimeToMakeRopeColorful {
    public static void main(String[] args) {
        int[] neededTime = {1,2,3,4,1b};
        String colors = "aabaa";
        System.out.println(minCost(colors, neededTime));
    }
    public static int minCost(String colors, int[] neededTime){
        char[] a = new char[colors.length()];
        for(int i=0;i!=a.length;i++){
            a[i] = colors.charAt(i);
        }
        int cost = 0;
        for(int i=0;i!=a.length-1;i++){
            if(a[i]==a[i+1]){
                cost = cost+neededTime[i];
            }
        }
        return cost;
    }
}
