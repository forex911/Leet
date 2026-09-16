// Last updated: 9/16/2026, 2:03:28 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        int i=s.length();
        char[] store=new char[i];
        for(int j=0;j<i;j++){
            store[indices[j]]=s.charAt(j);
        }
        return new String(store);
    }
}