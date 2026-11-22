class Solution {
    public boolean checkString(String s) {
        int len = s.length();
        if(len==0)  return true;
        int pos=-1;
        for(int i=0; i<len; i++) {
            char ch = s.charAt(i);
            if(ch=='b'){
                pos = i;
                break;
            }
        }
        if(pos==-1)  return true;
        else {
            for(int i=pos; i<len; i++) {
            char ch = s.charAt(i);
            if(ch=='a') return false;
        }
        return true;
        }
    }
}