class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val n = nums.size;
        nums.sort();
        for(i in 0 until n-1){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
