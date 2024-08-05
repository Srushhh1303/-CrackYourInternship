public class AddBinary {
    public static String addBinary(String a, String b) {
        int i=a.length()-1;int j=b.length()-1;
        int sum=0;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0 || j>=0){
            sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(i)-'0';//to convert it into char to int
                j--;
            }
            result.append(sum%2);
            carry=sum/2;
        }
        if(carry!=0){
            result.append(carry);
        }
        return  result.reverse().toString();
    }
    public static void main(String[] args){

    }
}
