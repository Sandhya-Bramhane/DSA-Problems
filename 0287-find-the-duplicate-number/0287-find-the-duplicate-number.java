class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        int duplicate = 0;
        
        for(int i = 0; i < nums.length-1; i++)
        {
            // for(int j = i + 1; j < nums.length; j++)
            // {
            //     if(nums[i] == nums[j])
            //     {
            //         duplicate = nums[i];
            //     }
            // }
            
                if(nums[i] == nums[i+1])
                {
                    duplicate = nums[i];
                }
            
        }
        return duplicate;
    }
}