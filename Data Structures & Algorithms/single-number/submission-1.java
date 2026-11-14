class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                hs.remove(nums[i]);
            }else{
                hs.add(nums[i]);
            }

        }
        for(int n: hs){
            return n;
        }
        return -1;
        
    }
}
