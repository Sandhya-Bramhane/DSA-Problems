class Solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        //new array to store merge of nums1 & nums2
        int temp[] = new int[m+n];
        
        while(i < m && j < n)
        {
             if(nums1[i] <= nums2[j])
             { 
                temp[k] = nums1[i];
                k++;
                i++;
                  }
             else{
                 temp[k] = nums2[j];
                 k++;
                 j++;
                  
              }
        }
        
        //copy remaining elements of nums1
        while(i < m)
        {
            temp[k] = nums1[i];
            k++;
            i++;
        }
        
        //copy remaining elemnts of nums2
        
        while(j < n)
        {
            temp[k] = nums2[j];
            k++;
            j++;
        }
        
        //copy temp[k] to nums1 for result
        for(int r = 0; r < m+n; r++)
        {
            nums1[r] = temp[r];
        }
       
}
}