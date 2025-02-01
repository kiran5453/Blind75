class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            lowestPrice = Math.min(lowestPrice, price);
            maxProfit = Math.max(maxProfit, price-lowestPrice);
        }
        return maxProfit;
    }
}
