// Last updated: 5/25/2026, 11:13:02 AM
class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int i=1;i<n;i++){
                StringBuilder value=new StringBuilder();
                int count=1;
                for(int j=1;j<result.length();j++){
                if(result.charAt(j)==result.charAt(j-1)){
                    count++;
                }
                else{
                    value.append(count).append(result.charAt(j-1));
                    count=1;
                }  
        }
        value.append(count).append(result.charAt(result.length()-1));
                result=value.toString();  
        }
       return result;
        
    }
}