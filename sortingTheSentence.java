import java.util.Arrays;

public class sortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] split = s.split(" ");
        int i=0;
        while(i<split.length){
            String value = split[i];
            String[] c = value.split("");
            int correctValue = Integer.valueOf(c[c.length-1]);
            int correct =  correctValue-1;
            if(i!=correct){
                swap(split, i, correct);
            }
            else{i++;}

        }
        String ans = "";
        for(int j=0;j!=split.length;j++){
            String value = split[j];
            String[] c = value.split("");
            String c2 = "";
            for(int k=0;k!=c.length-1;k++){
                c2 = c2+ c[k];
            }
            ans = ans+c2+" ";
        }
        return ans.replaceAll("\\s+$", "");
    }
    public static void swap(String[] arr, int first, int seccond){
        String temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] =temp;
    }
}
