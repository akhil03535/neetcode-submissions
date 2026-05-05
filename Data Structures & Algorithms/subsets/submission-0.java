class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       int n=nums.length;
        if(n==0)
    {
        return new ArrayList<>();
    }

    List<List<Integer>>res=new ArrayList<>();
    backtrack(0,nums,new ArrayList<>(),res);
    return res;
        
    }

    public static void backtrack(int index,int nums[],List<Integer>current,List<List<Integer>>res){

        if(index==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

      backtrack(index+1,nums,current,res);
      
        
        current.add(nums[index]);
        backtrack(index+1,nums,current,res);
        current.remove(current.size()-1);
      
    }
}
