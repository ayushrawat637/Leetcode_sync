class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=1;
        int len=nums.length;
        int arr[] = new int[len];
        int i=0;
        while(i < len) {
            if(nums[i]>0) {
                arr[pos] = nums[i];
                pos = pos+2;
            }
            else {
                arr[neg] = nums[i];
                neg = neg+2;
            }
            i++;
        }
        return arr;
    }
}
