class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        globalsum = nums[0]
        currentsum = nums[0]
        for i in range(1,len(nums)):
            currentsum = max(nums[i],currentsum+nums[i])
            globalsum  = max(globalsum,currentsum)
        return globalsum
     