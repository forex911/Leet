// Last updated: 9/16/2026, 2:02:42 PM
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