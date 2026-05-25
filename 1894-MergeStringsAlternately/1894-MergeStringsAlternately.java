// Last updated: 5/25/2026, 11:07:48 AM
class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder res=new StringBuilder();
        int n=Math.max(w1.length(),w2.length());

            for(int i=0;i<n;i++){
                if(i>=w2.length()){
                    res.append(w1.charAt(i));
                    continue;
                }
                if(i>=w1.length()){
                    res.append(w2.charAt(i));
                    continue;
                }
                res.append(w1.charAt(i));
                res.append(w2.charAt(i));
            }
        String rese=res.toString();
        return rese;

    }
}