// Last updated: 5/25/2026, 11:07:31 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        char tem='-';
        for(String c:operations){
            if (c.charAt(0) == tem || c.charAt(c.length() - 1) == tem){
                  x-=1;
            }
            else{
                x+=1;
            }
        }
        return x;
    }
}