class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int need=target-nums[i];
        
        if(hs.contains(need));{
        for(int j=0;j<i;j++)
        {
            if(nums[j]==need){
            return new int[]{j,i};
        }
        }
        }
        
    
     hs.add(nums[i]);
    }
    return new int[]{-1,-1};
}
}