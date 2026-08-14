// Last updated: 8/14/2026, 10:42:41 AM
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int arr[]  = new int[s.length()];
        for(int a[] : shifts){
            int l =a[0];
            int r =a[1];
            int x = a[2];
            if(x==0) x=-1;
            arr[l]+=x;
            if(r+1<arr.length) arr[r+1]-=x;
        }
        for(int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            arr[i]=arr[i]%26;
            int shift = ((arr[i] % 26) + 26) % 26;
            sb.append((char)((s.charAt(i) - 'a' + shift) % 26 + 'a'));
        }
        return sb.toString();
    }
}