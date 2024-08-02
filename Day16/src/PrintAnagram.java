import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class PrintAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list =new ArrayList<>();

        HashMap<String,Integer> map=new HashMap<>(); //string and index
        int i=0;
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String temp=new String(charArray);
            if(map.containsKey(temp)){
                int idx=map.get(temp);
                list.get(idx).add(str);
            }else{
                map.put(temp,i);
                list.add(new ArrayList()); //init a new list
                list.get(i).add(str);
                i++;
            }

        }
        return list;
    }
    public static void main(String[] args) {

    }
}
