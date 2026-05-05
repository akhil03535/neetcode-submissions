class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length()!=t.length()){
        return false;
       }

       char ch[]=s.toCharArray();
       char ch1[]=t.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch1);

       String newS=new String(ch);
       String newt=new String(ch1);

       return newS.equals(newt);




    }
}
