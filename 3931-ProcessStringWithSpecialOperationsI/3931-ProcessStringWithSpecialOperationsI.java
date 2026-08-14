// Last updated: 8/14/2026, 10:41:17 AM
class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(char x:s.toCharArray()){
            if(x=='#'){
                res.append(res);
            }
            else if(x=='*'){
                if(res.length()!=0){
                    res.deleteCharAt(res.length()-1);
                }
            }
            else if(x=='%'){
                res.reverse();
            }
            else{
                res.append(x);
            }
        }
        return res.toString();
    }
}