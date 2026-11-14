class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxSubArray(nums) {
        let maxi = nums[0];
        let temp = nums[0];
        for(let i =1;i<nums.length;i++){
            maxi  = Math.max(nums[i],maxi+nums[i]);
            temp = Math.max(maxi,temp);

        }
        return temp;



    }
}
