// Last updated: 2/4/2026, 8:58:49 PM
class Solution {
    public String reverseByType(String s) {
        char[] arr=s.toCharArray();
        List<Character>letters=new ArrayList<>();
        List<Character>specials=new ArrayList<>();
        for(char ch:arr){
            if(Character.isLowerCase(ch)){
                letters.add(ch);
            }
            else{
                specials.add(ch);
            }
        }
        Collections.reverse(letters);
        Collections.reverse(specials);
        int l=0,str=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i]=letters.get(l++);
            }else{
                arr[i]=specials.get(str++);
            }
        }
        return new String (arr);
    }
}