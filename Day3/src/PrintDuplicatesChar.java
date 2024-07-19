import java.util.HashMap;

public class PrintDuplicatesChar {
    public static char[] duplicates(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char ans[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }else{
                map.put(ch,1);
            }
        }
        int i=0;
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                ans[i++]=ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        char ans[]=duplicates("geeksforgeeks");
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
