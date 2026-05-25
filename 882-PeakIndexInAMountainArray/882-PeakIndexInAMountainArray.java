// Last updated: 5/25/2026, 11:08:48 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int st=0;
      int end=arr.length-1;
      while(st<end){
        int mid=(st+end)/2;
        if(arr[mid]>arr[mid+1]){
            end=mid;
        }
        else{
            st=mid+1;
        }
      }
      return end;
}
}