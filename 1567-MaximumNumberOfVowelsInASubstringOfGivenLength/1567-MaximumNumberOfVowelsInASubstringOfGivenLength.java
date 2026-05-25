// Last updated: 5/25/2026, 11:08:06 AM
class Solution {
    // public int vov(String s,int n,int k){
    //    int cou=0;
    //     while(n<k){
    //         char c=s.charAt(n);
    //         if(c=='a' || c== 'e' || c=='i' ||c=='o' ||c== 'u'){
    //             cou++;
    //         }
    //         n++;
    //     }
    //     return cou;
    // }
    public int maxVowels(String s, int k) {
        // int max=vov(s,0,k);
        // for(int i=k;i<s.length();i++){
        //     int r=vov(s,(i-k)+1,i);
        //     if(r>max){
        //         max=r;
        //     }
        // }
        // return max;
        int cou=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a' || c== 'e' || c=='i' ||c=='o' ||c== 'u'){
                     cou++;
            }
        }
        int max=cou;
        for(int i=k;i<s.length();i++){
            char c=s.charAt(i-k);
            if(c=='a' || c== 'e' || c=='i' ||c=='o' ||c== 'u'){
                     cou--;
            }
            char c1=s.charAt(i);
            if(c1=='a' || c1== 'e' || c1=='i' ||c1=='o' ||c1== 'u'){
                     cou++;
            }
            if(cou>max){
                max=cou;
            }
        }
        return max;
    }
}