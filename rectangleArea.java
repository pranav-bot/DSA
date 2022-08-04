public class rectangleArea {
    public static void main(String[] args) {
        int ax1 = -3;
        int ay1 = 0;
        int ax2 = 3;
        int ay2 = 4;
        int bx1 = 0;
        int by1 = -1;
        int bx2 = 9;
        int by2 = 2;
        System.out.println(computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2)); 
        
    }
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x_overlap2 = Math.max(0,Math.min(ax2, bx2)-Math.max(ax1, bx1));
        int y_overlap2 = Math.max(0, Math.min(ay2, by2)-Math.max(ay1, by1));
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int ans = (area1+area2) - (x_overlap2*y_overlap2);
        return ans ;
    }
    public static int turnpositive(int x){
        if(x<0){
            x = x*-1;
        }
        return x;
    }
    
}
