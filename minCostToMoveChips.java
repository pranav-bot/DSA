class minCostToMoveChips{
    public static void main(String[] args) {
        int[] position = {1,2,3,4,5,6,0,0,0,0,0,0};
        System.out.println(minCostToMoveChips(position));
        
    }
    public static int minCostToMoveChips(int[] position){
        int n = position.length;
        int even=0;
        for(int i:position){
            if(i%2==0){
                even++;
            }
            int odd = n-even;
            if(odd>even){
                return odd;
            }
            else{
                return even;
            }
        }
        return even;

    }
}
