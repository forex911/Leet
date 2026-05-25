// Last updated: 5/25/2026, 11:12:34 AM
class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(x/mid==mid){
                return mid;
            }
            else if(x/mid<mid){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return high;
    }
}