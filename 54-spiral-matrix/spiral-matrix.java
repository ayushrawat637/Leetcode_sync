class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int fr = 0, lr = n-1, fc = 0, lc = m-1;
        List<Integer> ans= new ArrayList<>();
        
        while(fr<=lr && fc<=lc) {
            //Go right
            for(int j = fc; j<=lc; j++) {
                ans.add(arr[fr][j]);
            }
                fr++;
                if(fr > lr || fc > lc)  break;
                
            //Go down
            for(int i = fr; i<=lr; i++) {
                ans.add(arr[i][lc]);
            }
                lc--;
                if(fr > lr || fc > lc)  break;
            
            //Go left
            for(int j = lc; j>=fc; j--) {
                ans.add(arr[lr][j]);
            }
                lr--;
                if(fr > lr || fc > lc)  break;
            
            //Go up
            for(int i= lr; i>=fr; i--) {
                ans.add(arr[i][fc]);
            }
                fc++;
        }
        return ans;
    }
}