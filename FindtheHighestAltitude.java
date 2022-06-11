//The logic is to find the running sum of the array return the smallest value where the smallest default value is 0
public class FindtheHighestAltitude {
    public static void main(String[] args) {

    }
    static int Highestaltitude(int[] gain){
        int sum=0;
        int Maxheight=0;
        for(int i=1;i!= gain.length;i++){
            sum=sum+gain[i];
            if(sum>Maxheight){
                Maxheight=sum;
            }
        }
        return Maxheight;
        }

    }

