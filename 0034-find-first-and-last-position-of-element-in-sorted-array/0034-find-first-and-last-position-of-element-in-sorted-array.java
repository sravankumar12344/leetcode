class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[]{first,last};
    }
        public int findFirst(int[]nums,int target)
        
        {
            int l=0;
            int h=nums.length-1;
            int a=-1;
            while(l<=h)
            {
                int m=l+(h-l)/2;
                if(nums[m]==target)
                {
                    a=m;
                    h=m-1;
                }
                else if(nums[m]>target)
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
           return a;

        }
        public int findLast(int []nums,int target)
        {
            int l=0;
            int h=nums.length-1;
            int a=-1;
            while(l<=h)
            {
                int m=l+(h-l)/2;
                if(nums[m]==target)
                {
                a=m;
                l=m+1;

                }
                else if(nums[m]>target)
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            return a;
           

        }
       
    }
