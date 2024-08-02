import java.util.*;
public class IntegerToRoman {
    public static String intToRoman(int num) {
        //we will just hard code the values of roman no.s and possible 9 and 4
        int []intcode={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder sb=new StringBuilder("");
        String code[]= {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        for(int i=intcode.length-1;i>=0;i--){
            while(num>0 && num>=intcode[i]){
                num=num-intcode[i];
                sb.append(code[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
       int num = 3749;
        System.out.println(intToRoman(num));
    }
}
