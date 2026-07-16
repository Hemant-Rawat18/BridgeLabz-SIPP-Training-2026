class Solution {
    public boolean isAnagram(String s, String t) {
        char c[]=s.toCharArray();
        char p[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(p);
        if(c.length!=p.length){
            return false;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=p[i]){
                return false;
            }
        }
        return true;
        
    }
}