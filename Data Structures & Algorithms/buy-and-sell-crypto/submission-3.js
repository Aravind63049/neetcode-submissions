class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let ans = 0;
        for(let i = 0;i<prices.length;i++){
            for(let j=i+1;j<prices.length;j++){
                let temp = prices[j]-prices[i];
                ans = Math.max(ans,temp);

            }
        }
        return ans;






    }
}
