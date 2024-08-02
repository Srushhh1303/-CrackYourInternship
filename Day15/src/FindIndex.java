public class FindIndex {
    public static int strStr(String haystack, String needle) {

        int j=0;
        int idx=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==0) idx=i;
                j++;
                if(j==needle.length()-1) return idx;
            }

        }
        return -1;
    }

        public static int strStr2(String haystack, String needle) {
            if(haystack.contains(needle)){
                return haystack.indexOf(needle);
            }
            return -1;
        }

    public static void main(String args[]){
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
