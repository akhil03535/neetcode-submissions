class Solution {
    public List<String> generateParenthesis(int n) {

        if(n==0)
        {
            return new ArrayList<>();
        }

        List<String>res=new ArrayList<>();
        backtrack(n,res,new StringBuilder(),0,0);
        return res;
        
    }
    public static void backtrack(int n,List<String>res,StringBuilder current, int open,int close){
        if(current.length()==2*n){
            res.add(current.toString());
            return;
            }

            if(open<n)
               {
                current.append('(');
                backtrack(n,res,current,open+1,close);
                current.deleteCharAt(current.length()-1);
                }
            if(close<open){
                current.append(')');
                backtrack(n,res,current,open,close+1);
                current.deleteCharAt(current.length()-1);
            }
    }
}
