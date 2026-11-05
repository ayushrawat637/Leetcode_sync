class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i=0;
        int count=0;
        while(i<len1) {
            int c=0;
            for(int j=0; j<len2; j++) {
                if(Math.abs(arr1[i]-arr2[j]) <= d) {
                    c++;
                    break;
                } 
            }
            if(c==0)    count++;
            i++;
        }
        return count;
    }
}