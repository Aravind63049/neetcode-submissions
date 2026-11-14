class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int [nums.length];
        int start = 0;
        int end = nums.length-1;
        int idx = nums.length-1;
        while(start<=end){
            int ls = nums[start]*nums[start];
            int rs = nums[end]*nums[end];
            if(ls>rs){
                arr[idx] = ls;
                idx--;
                start++;
            }else{
                arr[idx] = rs;
                idx--;
                end--;
            }
        }
        return arr;
        
    }
}