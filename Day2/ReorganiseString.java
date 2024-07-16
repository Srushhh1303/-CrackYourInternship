import java.util.*;
public class ReorganiseString {
    public static String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder res=new StringBuilder();
        while(maxHeap.size()>=2){
            char c1=maxHeap.remove();
            char c2=maxHeap.remove();

            res.append(c1);
            res.append(c2);

            map.put(c1,map.get(c1)-1);
            map.put(c2,map.get(c2)-1);

            if(map.get(c1)>0) maxHeap.add(c1);
            if(map.get(c2)>0) maxHeap.add(c2);
        }
        if(!maxHeap.isEmpty()){
            char ch=maxHeap.remove();
            if(map.get(ch)>1) return "";
            res.append(ch);
        }
        return res.toString();
    }
    public static void main(String args[]){
        String ans=reorganizeString("vvvlo");
        System.out.println(ans);
    }
}
