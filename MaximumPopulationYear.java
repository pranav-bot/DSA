import java.util.Arrays;

//Does Not work
public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] n={
                {1993,1999},
                {2000,2003},
                {1999,2000}
        };
        System.out.println(Arrays.toString(Maximumpopulation(n)));
    }
    static int[] Maximumpopulation(int[][] logs){
        int birthyear[]=new int[logs[logs.length].length];
        int deathyear[]=new int[logs[logs.length].length];
        for(int i=0;i!= logs.length;i++) {
            for (int j =0; j != logs[i].length; j++) {
                birthyear[i] = logs[j][i];
                deathyear[i] = logs[i][j];

            }
        }

        return deathyear;
    }
}
