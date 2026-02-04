// Last updated: 2/4/2026, 8:58:54 PM
class Solution {
    public int residuePrefixes(String s) {
        int[] freq=new int[26];
        int d=0;int c=0;
        for(int i=0;i<s.length();i++){
            int in=s.charAt(i) - 'a';
            if(freq[in]==0){
                d++;
        }
        freq[in]++;
        int l=i+1;
        if(d==l%3){
            c++;}
        
    }
        return c;
}
}
