class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<haystack.length();i++){
            s.append(haystack.charAt(i));
        }
        return s.indexOf(needle);
    }
}