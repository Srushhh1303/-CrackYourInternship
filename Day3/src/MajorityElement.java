public class MajorityElement {
    public int majorityElement(int[] v) {
        int n=v.length;
        int count=0;
        int ele=0;
        for(int i=0;i<v.length;i++){
            if(count==0){
                 ele=v[i];
                count++;
            }else if(v[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        int cnt1=0;
        for(int i=0;i<v.length;i++){
            if(v[i]==ele){
                cnt1++;
            }
        }
        if(cnt1>(n/2)){
            return ele;
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums = {2,2,1,1,1,2,2};
    }
}
