class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val arr = IntArray(nums.size*2);
        val n = nums.size;
        for(i in 0 until n){
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }
        return arr;
    }
}
