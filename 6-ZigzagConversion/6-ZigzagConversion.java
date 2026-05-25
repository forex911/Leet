// Last updated: 5/25/2026, 11:13:40 AM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>s.length()) return s;
        List<Character>[] row=new ArrayList[numRows];
        int ind=0,d=1;
        for(int i=0;i<numRows;i++){
            row[i]=new ArrayList<>();
        }
        for(char c:s.toCharArray()){
            row[ind].add(c);
            if(ind==0) d=1;
            else if(ind==numRows-1) d=-1;
            ind+=d;
        }
        StringBuilder re=new StringBuilder();
        for(List<Character> r:row){
            for(char c:r){
                re.append(c);
            }
        }
        return re.toString();
    }
}