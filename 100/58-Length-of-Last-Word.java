class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char ch[]=s.toCharArray();
        int i=0;
        for(i=ch.length-1;i>=0;i--){
            if(ch[i]==' '){
                break;
            }
        }
        return ch.length-i-1;
    }
}