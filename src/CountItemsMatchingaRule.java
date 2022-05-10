//Asa we know there are going to be 3 rows woith fixed position of parameters in every column, so we assign the 3 parameters to 3 indexes
//then we bruteforce check every specific index of the parameter we want with the element at that index at every column
import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {
        List<List<String>> items=new ArrayList<List<String>>();

    }
    static int itemsmatchingarule(List<List<String>> items, String ruleKey,String ruleValue){
        int count=0;
        int option;
        if(ruleKey.equals("type")){
            option=0;
        }
        else if(ruleKey.equals("color")){
            option=1;
        }
        else{
            option=2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(option).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

}