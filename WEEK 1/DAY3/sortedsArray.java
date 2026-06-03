class sortedsArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans [] = new int [n];

        int l =0;
        int r = n - 1;
        int i = n - 1;

        while(l <= r){
            int lsquare = nums[l] * nums[l];
            int rsquare = nums[r] * nums[r];

            if(lsquare > rsquare){
                ans[i] = lsquare;
                l++;
            }
            else {
                ans[i] = rsquare;
                r--;
            }
            i--;
        }
        return ans;
        
    }
}
