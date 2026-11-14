class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val n = nums.size;
        val map = HashMap<Int,Int>();
        for(i in 0 until n){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],1);
            }
        }

        return false;

    }
}
