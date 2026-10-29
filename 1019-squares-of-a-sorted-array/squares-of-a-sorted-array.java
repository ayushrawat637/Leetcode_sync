class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        int result[] = new int[nums.length];
        while(left<=right) {
            int rightsq=nums[right]*nums[right];
            int leftsq=nums[left]*nums[left];
            if(leftsq>rightsq)  {
                result[i] = leftsq;
                left++;
            }
            else {
                result[i] = rightsq;
                right--;
            }
            i--;
        }
        return result;
    }
}