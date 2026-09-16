// Last updated: 9/16/2026, 2:04:10 PM
class Solution {
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0) {
            return false;
        }
        if (arr[start] == 0) {
            return true;
        }
        int jumpDistance = arr[start];
        arr[start] = -1; 
        return canReach(arr, start + jumpDistance) || canReach(arr, start - jumpDistance);
    }
}