// Last updated: 5/25/2026, 11:08:19 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                int temp=arr[i];
                arr[i]=max;
                max=temp;
            }
            else{
                arr[i]=max;
            }
                }        
        return arr;
    }
}