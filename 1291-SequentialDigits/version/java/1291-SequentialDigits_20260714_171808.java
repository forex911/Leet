// Last updated: 7/14/2026, 5:18:08 PM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> ans =new ArrayList<>();
4        String store="123456789";
5        int lowlen=Integer.toString(low).length();
6        int highlen=Integer.toString(high).length();
7        for(int i=lowlen;i<=highlen;i++){
8            int check=0;
9            for(int j=0;j+i<=9;j++){
10                String an=store.substring(j,j+i);
11                check=Integer.parseInt(an);
12                System.out.print(check);
13                if(check>=low && check<=high){
14                ans.add(check);
15            }
16            }
17        }
18         return ans;
19    }
20   
21}
22
23