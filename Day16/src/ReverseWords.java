import java.util.Stack;
public class ReverseWords {
    public static String reverseWords(String str) {

        String[] arr=str.split(" ");
        Stack<String> s=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=""){
                s.push(arr[i]);
            }
        }
        while(!s.isEmpty() && s.size()!=1){
            sb.append(s.pop() + " ");
        }
        if(s.size()==1){
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="The sky is blue";
        System.out.println(reverseWords(str));
    }
}
