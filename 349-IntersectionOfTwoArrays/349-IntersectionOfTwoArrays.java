// Last updated: 5/25/2026, 11:10:11 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList();
        for (int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        if(list.contains(nums1[i])){
                            continue;
                        }
                        list.add(nums1[i]);
                        break;
                    }
                }
        }
        int []arr=new int[list.size()];
        int index=0;
        for(int val:list){
            arr[index++]=val;
        }
        return arr;
    }
}