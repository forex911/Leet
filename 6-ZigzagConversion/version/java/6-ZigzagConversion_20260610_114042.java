// Last updated: 6/10/2026, 11:40:42 AM
1class Solution {
2    public String convert(String s, int numRows) {
3        if(numRows>=s.length() || numRows==1) return s;
4        List<Character>[] res=new ArrayList[numRows];
5        for(int i=0;i<numRows;i++){
6            res[i]=new ArrayList<>();
7        }
8        int ind=0;
9        int d=1;
10        for(char c:s.toCharArray()){
11            res[ind].add(c);
12            if(ind==0){d=1;}
13            else if(ind==numRows-1){
14                d=-1;
15            }
16            ind+=d;
17        }
18        StringBuilder re=new StringBuilder();
19        for(List<Character> x:res){
20            for(char c:x){
21                re.append(c);
22            }
23        }
24        return re.toString();
25    }
26}