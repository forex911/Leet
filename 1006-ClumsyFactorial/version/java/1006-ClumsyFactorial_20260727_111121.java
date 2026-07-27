// Last updated: 7/27/2026, 11:11:21 AM
1class Solution {
2    public int clumsy(int n) {
3        int ans=0;
4        int counter=0;
5        Stack<Integer> store=new Stack<>();
6        store.push(n);
7        n--;
8        while(n>0){
9            int c=counter%4;
10            if(c==0){
11                int tem=store.pop();
12                tem=tem*n;
13                store.push(tem);
14            }
15            if(c==1){
16                int tem=store.pop();
17                tem=tem/n;
18                store.push(tem);
19            }
20            if(c==2){
21                store.push(n);
22            }
23            if(c==3){
24                store.push(-n);
25            }
26            n--;
27            counter++;
28        }
29        while(!store.isEmpty()){
30            ans+=store.pop();
31        }
32        return ans;
33    }
34}