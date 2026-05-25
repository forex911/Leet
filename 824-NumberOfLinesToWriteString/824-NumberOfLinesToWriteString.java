// Last updated: 5/25/2026, 11:08:57 AM
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0 , incre = 100;
        for(char ch : s.toCharArray()){
            int temp = widths[ch - 'a'];
            if(sum == incre){
                incre += 100;
            }

            if(sum + temp > incre){
                sum += (incre - sum) + temp;
                incre += 100;
            }else {
                sum += temp;
            }
        }
        return new int[]{sum % 100 == 0 ? sum / 100 : (sum / 100) + 1 , sum % 100 == 0 ? sum : sum % 100};
    }
}