// Last updated: 9/16/2026, 1:59:33 PM
class Solution {
    public int maximumGap(String s, String st) {
        int n=s.length(),m=st.length();
        int[] l=new int[n];
        int[] r=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            while(st.charAt(j)!=s.charAt(i)) j++;
            l[i]=j++;
        }
        j=m-1;
        for(int i=n-1;i>=0;i--){
            while(st.charAt(j)!=s.charAt(i))j--;
            r[i]=j--;
        }
        int ans=0;
        for(int i=1;i<n;i++)ans=Math.max(ans,r[i]-l[i-1]);  
        return ans;
    }
}