// Last updated: 5/25/2026, 11:07:44 AM
class Solution {
    public boolean checkIfPangram(String s) {
        HashMap<Character,Integer> check=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            check.put(ch,check.getOrDefault(ch,0)+1);
        }

        if(check.size()!=26){
            return false;
        }
        return true;
    }
}