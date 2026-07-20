class Solution {
    public boolean detectCapitalUse(String s) {
    int count=0;
   
    for(int i=0;i<s.length();i++){
        if(Character.isUpperCase(s.charAt(i))){
            count++;
        }
    }
    if(count==s.length())return true;
    if(count==1 && Character.isUpperCase(s.charAt(0)))return true;
     if(count==0)return true;
    
    return false;
    }
}