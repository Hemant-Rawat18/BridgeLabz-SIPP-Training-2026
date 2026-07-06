class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        StringBuilder sb=new StringBuilder ();
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }

            
        }
        int l=0;
        int r=sb.length()-1;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}