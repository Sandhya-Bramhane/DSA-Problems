class Solution {
    public int maxSubArray(int[] nums) {
        
       
        int CurrentSum = 0;
        int MaximumSum = Integer.MIN_VALUE;
        boolean allNegative = true;
        
        for(int i = 0; i < nums.length; i ++)
        {
            if (nums[i] >= 0) {
                allNegative = false;
            }
            
            CurrentSum = CurrentSum + nums[i]; 
            
            if(CurrentSum < 0) 
            {
                CurrentSum = 0;
            }
            
            MaximumSum = Math.max(MaximumSum,CurrentSum);
            
        }
        
        if (allNegative) {
            MaximumSum = nums[0];
            for (int num : nums) {
                MaximumSum = Math.max(MaximumSum, num);
            }
        }
        
        return MaximumSum;
        
    }
}