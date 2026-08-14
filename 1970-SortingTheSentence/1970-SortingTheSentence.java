// Last updated: 8/14/2026, 10:43:29 AM
class Solution {
    public String sortSentence(String s) {
        String[] store=s.split(" ");
        String[] ind=new String[store.length];
        for(int i=0;i<store.length;i++){
            int pos=store[i].charAt(store[i].length()-1)-'0';
            String word=store[i].substring(0,store[i].length()-1);
            ind[pos-1]=word;
        }
        String ans="";
        for(int i=0;i<store.length;i++){
            ans+=ind[i];
            if(i<store.length-1){
                ans+=" ";
            }
        }
        return ans;

    }
}