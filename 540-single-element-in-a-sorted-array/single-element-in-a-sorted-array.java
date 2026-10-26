class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0, r=nums.length-1;
        int mid=0;
        int n= nums.length;
        if(n==1)    return nums[0];
        while(l<=r) {
            mid=(l+r)/2;
            if ((mid == 0 || nums[mid-1] != nums[mid]) &&
                (mid == n-1 || nums[mid+1] != nums[mid])) {
                return nums[mid];
            }
            else if ( (mid % 2 == 0 && mid < n-1 && nums[mid+1] == nums[mid]) ||
                (mid % 2 != 0 && mid > 0 && nums[mid-1] == nums[mid])) {
                l=mid+1;
            }
            else if ( (mid % 2 == 0 && mid > 0 && nums[mid-1] == nums[mid]) ||
                (mid % 2 != 0 && mid < n-1 && nums[mid+1] == nums[mid])) {
                r=mid-1;
            }
        }
        return nums[mid];
    }
}