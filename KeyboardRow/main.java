package KeyboardRow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));


        
    }   
    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for(String word: words){
            String lower = word.toLowerCase();
            String row;
            char first = lower.charAt(0);
            if (row1.indexOf(first)!=-1){
                row = row1;
            }
            else if (row2.indexOf(first)!=-1){
                row = row2;
            }
            else{
                row = row3;
            }
            boolean val = true;
            for(char i: lower.toCharArray()){
                if(row.indexOf(i)==-1){
                    val = false;
                }
            }
            if(val){
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);    
    } 
}
