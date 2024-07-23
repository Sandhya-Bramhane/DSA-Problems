class Solution {
    public int maxArea(int[] height) {
        
       //width
        //minHeight
        //area
        //MaxareaContainer
        
        
        int left = 0;
        int right = height.length-1;
        int MaxareaContainer = 0;
        
        
        while(left < right)
        {
          
            
            int width = right - left;
            
            int minHeight = Math.min(height[left],height[right]);
                
            int area = width * minHeight;
            
            MaxareaContainer = Math.max(MaxareaContainer,area);
            
            if(height[left] < height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        
        
        return MaxareaContainer;
        
        
        
        
    }
}