class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int ele1=0, ele2=0, c1=0, c2=0;
        for(int i : nums) {
            if(i==ele1) c1++;
            else if (i==ele2)   c2++;
            else if (c1==0) {
                ele1=i;
                c1++;
            }
            else if (c2==0) {
                ele2=i;
                c2++;
            }
            else {
                c1--; c2--;  
            }  
        }
        c1=0; c2=0;
        for(int i : nums) {
            if(i==ele1) c1++;
            else if(i==ele2)    c2++;
        }
        if(c1>nums.length/3)    ans.add(ele1);
        if(c2>nums.length/3)    ans.add(ele2);
        return ans;
    }
}