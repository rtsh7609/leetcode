class Solution {
    public List<List<Integer>> permuteUnique(int[] nums)
     {
        Arrays.sort(nums);
     List<List<Integer>> ans = new ArrayList<>();
       List<Integer>  list = new ArrayList<>();
       boolean [] check = new boolean[ nums.length];
     perU(nums,check,ans , list);
     return ans ;
     }

    public void perU(int[] nums, boolean []check,List<List<Integer>> ans, List<Integer> list){
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
        else
        {
            for(int i = 0 ; i <nums.length; i ++)
            {
                if(!check[i])
                {
                     if(i > 0 && nums[i] == nums[i - 1] && !check[i - 1])
                     continue;
                    list.add(nums[i]);
                    check[i] =true ;
                    perU(nums, check , ans , list);
                    list.remove(list.size()-1);
                    check[i]= false;
                }
            }
        }

    }
}
 

  