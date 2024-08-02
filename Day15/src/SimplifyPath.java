import java.util.*;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String arr[]=path.split("/");
        Stack<String> s=new Stack<>();

        for(String str:arr){
            if(str.equals("..") && !s.isEmpty()){
                s.pop();
            }else if(!str.equals("") && !str.equals(".") && !str.equals("..")){
                s.push(str);
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(String str :s){ //we are iterating using a stack not popping as we dont want vlues in reverse order
            sb.append("/");
            sb.append(str);
        }
        return sb.length()==0 ? "/" : sb.toString();

    }
    public static void main(String args[]){

    }
}
