// Last updated: 5/25/2026, 11:10:10 AM
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b) ->{
            if(a[0]==b[0]) return b[1]-a[1];
           return a[0]-b[0];
        });
        int[] tails = new int[envelopes.length];
        int size=0;
        for(int[] env:envelopes){
            int h=env[1];
            int left=0;
            int right=size;
            while(left<right){
                int mid=(right+left)/2;
                if(tails[mid]<h) left=mid+1;
                else right=mid;
            }
            tails[left]=h;
            if(left==size) size++;
        }
        return size;
    }
}