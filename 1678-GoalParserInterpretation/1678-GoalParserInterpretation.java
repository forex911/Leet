// Last updated: 9/16/2026, 2:03:07 PM

class Solution {
    public String interpret(String command) {
        String ans=command.replace("()","o").replace("(al)","al");
        return ans;
    }
}