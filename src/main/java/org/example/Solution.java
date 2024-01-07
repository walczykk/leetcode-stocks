package org.example;

class Solution {
    public int maxProfit(int[] prices) {
        int l = prices[0];
        int maxProf = 0;
        for (int price : prices) {
            if (l >= price) {
                l = price;
                continue;
            }
            if (maxProf < price - l) {
                maxProf = price - l;
            }
        }
        return maxProf;
    }
}
