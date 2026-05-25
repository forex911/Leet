// Last updated: 5/25/2026, 11:07:47 AM
class Solution {
    public boolean checkOnesSegment(String s) {
        
        int idx=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){                
                if(i-idx>1){
                    return false;
                }
                idx=i;
            }
        }

        return true;

    }
}