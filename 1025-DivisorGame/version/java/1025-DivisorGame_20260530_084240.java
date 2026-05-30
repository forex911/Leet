// Last updated: 5/30/2026, 8:42:40 AM
1class Solution {
2    public String shiftingLetters(String s, int[][] shifts) {
3        int arr[]  = new int[s.length()];
4        for(int a[] : shifts){
5            int l =a[0];
6            int r =a[1];
7            int x = a[2];
8            if(x==0) x=-1;
9            arr[l]+=x;
10            if(r+1<arr.length) arr[r+1]-=x;
11        }
12        for(int i=1; i<arr.length; i++){
13            arr[i]+=arr[i-1];
14        }
15        StringBuilder sb = new StringBuilder();
16        for(int i=0; i<s.length(); i++){
17            arr[i]=arr[i]%26;
18            int shift = ((arr[i] % 26) + 26) % 26;
19            sb.append((char)((s.charAt(i) - 'a' + shift) % 26 + 'a'));
20        }
21        return sb.toString();
22    }
23}