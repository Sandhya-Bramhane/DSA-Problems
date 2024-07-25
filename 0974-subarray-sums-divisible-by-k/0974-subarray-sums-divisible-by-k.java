class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        
        int sum = 0;
        int remaindercount[] = new int[k];
        remaindercount[0] = 1;
        
        for(int num : nums)
        {
           
         sum = sum + num;
                
         int remainder = ((sum % k)+k)%k;
        
         count = count + remaindercount[remainder];
            
         remaindercount[remainder]++;
        }
        return count;
    }
}