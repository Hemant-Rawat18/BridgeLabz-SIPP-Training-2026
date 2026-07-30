class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String  l=strs[0];
        String r=strs[strs.length-1];
        String s="";
        for(int i=0;i<(Math.min(l.length(),r.length()));i++){
            if(l.charAt(i)==r.charAt(i)){
                s+=l.charAt(i);
            }else{
                break;
            }
        }
        return s;
    }
}