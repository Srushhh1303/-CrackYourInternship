
import java.util.*;
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        recurse(res,0,0,"",n);
        return res;
    }
    public void recurse(  List<String> res,int left,int right, String s ,int n){
        if(left==n && right==n) {
            res.add(s);
            return;
        }
        if(left<n)  recurse(res,left+1,right,s+"(",n);
        if(right<left) recurse(res,left,right+1,s+")",n);
    }
    public static void main(String args[]){

    }
}
