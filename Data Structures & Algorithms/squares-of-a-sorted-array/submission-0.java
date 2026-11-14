class Solution {
    public int[] sortedSquares(int[] nums) {
        int n  = nums.length;
        int ans[] = new int [n];      // take an array of length nums
        int l = 0;      // take a pointer as left or l as start point 
        int r = n-1;     // take a pointer as end or r as end point
        int idx = n-1;         // take other pointer as index where help to set a value at correct position from last
        while(l<=r){
            int lsq = nums[l]*nums[l];    // first square
            int rsq = nums[r]*nums[r];     // end square
            if(lsq>rsq){        // compare both 
                ans[idx--] = lsq;         // if first square greater than point at last in new array by using pointer idx
                l++;            // now increment first or left 
            }else{
                ans[idx--] = rsq;      // if end value is greater than pont at last using idx
                r--;      // decrease the last or r 
            }
        }
        return ans; 
    }
}