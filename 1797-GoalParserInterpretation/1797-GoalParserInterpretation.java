// Last updated: 8/14/2026, 10:43:58 AM

class Solution {
    public String interpret(String command) {
        String ans=command.replace("()","o").replace("(al)","al");
        return ans;
    }
}