// Last updated: 5/26/2026, 2:24:59 PM
1class Solution {
2  public int maxProfit(int[] prices) {
3    int sellTwo = 0;
4    int holdTwo = Integer.MIN_VALUE;
5    int sellOne = 0;
6    int holdOne = Integer.MIN_VALUE;
7
8    for (final int price : prices) {
9      sellTwo = Math.max(sellTwo, holdTwo + price);
10      holdTwo = Math.max(holdTwo, sellOne - price);
11      sellOne = Math.max(sellOne, holdOne + price);
12      holdOne = Math.max(holdOne, -price);
13    }
14
15    return sellTwo;
16  }
17}