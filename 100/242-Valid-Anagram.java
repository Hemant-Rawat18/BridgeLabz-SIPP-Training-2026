class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(ch.length!=ch1.length)return false;
        int l=0;
        int r=0;
        while(l<ch.length && r<ch1.length){
            if(ch[l]!=ch1[r]){
                return false;
            }
            l++;
            r++;
        }
        return true;
    }
}