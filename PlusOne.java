//Dosen't Work

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] a={9};

        System.out.println(Arrays.toString(AddtoArrayFormOfIntreger(a)));
    }
    static int[] AddtoArrayFormOfIntreger(int[] num) {
        int lastdigit= num.length-1;
        int[] ans1=new int[num.length+1];
        if(num.length==1){
            if(num[0]!=9){
                num[0]=num[0]+1;
            }
            else{
                ans1[1]=0;
                ans1[0]=1;
                return ans1;
            }
        }
        else if(num[lastdigit]<9){
            num[lastdigit]=num[lastdigit]+1;
            return num;
        }
        else if(num[lastdigit]==9){
            if(num[lastdigit-1]==9){
                for(int i=1;i!= ans1.length;i++){
                    ans1[0]=num[0]+1;
                    ans1[i]=0;
                    return ans1;
                }
            }
            else{
                num[lastdigit]=0;
                num[lastdigit-1]=num[lastdigit-1]+1;
                return num;
            }
        }
        return num;
    }
}
//    static int[] Aprroach2(int[] num){
//        int number=0;
//        int exponent=num.length-1;
//        for (int i=0;i!=num.length;i++)
//        {
//            number = (int) (number+num[i]*(Math.pow(10,exponent)));
//            exponent--;
//        }
//        int ans1=number+1;
//        int digit = 0;
//        int temp=ans1;
//        while (temp> 0)
//        {
//            digit++;
//            temp/= 10;
//        }
//        int[] ans=new int[digit];
//        int[] temparr=new int[digit+1];
//        int index = 0;
//int c=0;
//        while (ans1 > 0)
//        {
//            c=c*10;
//            int a=ans1%10;
//            temparr[++index] = (c+a);
//            ans1/= 10;
//        }
//        int i;
//        for(i = 0; i < index; i++)
//        {
//            ans[i] = temparr[index - i];
//        }
//        return ans;
//    }
//
//    }