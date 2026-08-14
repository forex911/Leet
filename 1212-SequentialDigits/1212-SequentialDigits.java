// Last updated: 8/14/2026, 10:45:13 AM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans =new ArrayList<>();
        String store="123456789";
        int lowlen=Integer.toString(low).length();
        int highlen=Integer.toString(high).length();
        for(int i=lowlen;i<=highlen;i++){
            int check=0;
            for(int j=0;j+i<=9;j++){
                String an=store.substring(j,j+i);
                check=Integer.parseInt(an);
                System.out.print(check);
                if(check>=low && check<=high){
                ans.add(check);
            }
            }
        }
         return ans;
    }
   
}

