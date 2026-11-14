class Solution:
    def maxProfit(self, prices: List[int]) -> int:
       
            n=len(prices)
            ans=0
            for i in range(n):
                for j in range(i+1,n):
                    temp =prices[j]-prices[i]
                    ans = max(ans,temp)
                    
            return ans


 
                
      
        
        
        
                