// Last updated: 5/25/2026, 11:11:42 AM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        solve(result,s,new ArrayList<>(),0);
        return result;
    }
    public void solve(List<List<String>> result,String s,List<String> cur,int st){
        if(st==s.length()){
            result.add(new ArrayList<>(cur));
            return;
        }
        for(int end=st;end<s.length();end++){
            String sub=s.substring(st,end+1);
            if(pali(sub)){
                cur.add(sub);
                solve(result,s,cur,end+1);
                cur.remove(cur.size()-1);
            }
        }
    }
    private boolean pali(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) !=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}