class Solution {
    public void moveZeroes(int[] nums) {
        
       int n = nums.length;
       int left = 0;

       for(int right = 0; right < n; right++)
       {
            if((nums[right]) != 0)
            {
                int temp = nums[right];

                nums[right] = nums[left];

                nums[left] = temp;

                left ++;
                //right = 0;
                //left = 0;
                //nums[0] = 0
                //nums[0] != 0 --> flase
                //right++;
                //0,1,0

                //right = 1
                //nums[1]  = 1
                //nums[1] != 0 --> true
                //nums[left] = temp..(nums[1]) -->swap 
                //nums[0] = 1
                //left ++ --> left = 1
                
                //right = 2
                //nums[2] = 0
                //nums[2] != 0 ---> false
                //right++;
                //left = 1

                //right = 3 
                //right[3] = 3
                 
                //same continue...................

            }
       }
    }
}