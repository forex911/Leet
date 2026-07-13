// Last updated: 7/13/2026, 9:41:20 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> ans=new ArrayList<>();
4        String s="123456789";
5        int lowlen=String.valueOf(low).length();
6        int highlen=String.valueOf(high).length();
7        for(int i=lowlen;i<=highlen;i++){
8            for(int j=0;j+i<=9;j++){
9                int ad=Integer.parseInt(s.substring(j,j+i));
10                if(ad<=high && ad>=low){
11                    ans.add(ad);
12                }
13            }
14        }
15        return ans;
16    }
17}