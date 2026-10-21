class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a=numbers.length-1;
        int left=0;
        int right=a;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                return new int[] {left+1,right+1};
            }
            if(sum<target)
            {
left++;

            }
            else
            right--;
        }
        return new int[]{};

    }
}