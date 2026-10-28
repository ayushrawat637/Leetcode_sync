class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd=1;
        int even=0;
        while(odd<nums.length && even<nums.length) {
            if(nums[even]%2==0) even+=2;
            else if(nums[odd]%2!=0) odd+=2;
            else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even = even+2;
                odd=odd+2;
            }
        }
        return nums;
    }
}