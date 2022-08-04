import java.util.Arrays;

public class determineIfHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
        
    }
    public static boolean halvesAreAlike(String s) {
        int size = s.length()/2;
        if(s.length()%2==1){
            size = (s.length()/2)+1;
        }
        char[] firstHalf = new char[s.length()/2];
        char[] seccondHalf = new char[size];
        for(int i=0;i!=s.length()/2;i++){
            firstHalf[i] = s.charAt(i);
        }
        for(int i=s.length()/2;i!=s.length();i++){
            seccondHalf[i-s.length()/2] = s.charAt(i);
        }
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count1 = 0;
        for(int i=0;i!=vowels.length;i++){
            for(int j=0;j!=firstHalf.length;j++){
                if(vowels[i]==firstHalf[j]){
                    count1++;
                }
            }
        }
        int count2 = 0;
        for(int i=0;i!=vowels.length;i++){
            for(int j=0;j!=seccondHalf.length;j++){
                if(vowels[i]==seccondHalf[j]){
                    count2++;
                }
            }
        }

        return count1==count2;

        
    }
    
}
