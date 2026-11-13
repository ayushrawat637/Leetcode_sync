class Solution {
    public int majorityElement(int[] nums) {
        int ele=0, c=0;
        for(int i : nums) {
            if(i==ele)  c++;
            else if(c==0) {
                ele=i;
                c++;
            }
            else c--;
        }
        c=0;
        for(int i : nums) {
            if(i==ele)  c++;
        }
        return ele;
    }
}