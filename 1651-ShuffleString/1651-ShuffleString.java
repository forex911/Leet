// Last updated: 8/14/2026, 10:44:13 AM
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