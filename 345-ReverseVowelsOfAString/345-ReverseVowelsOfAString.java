// Last updated: 5/25/2026, 11:10:12 AM
class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if (!isVowel(arr[i])) {
                i++; 
                continue;
            }
            if (!isVowel(arr[j])) {
                j--; 
                continue;
            }
            char tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
            i++;
            j--;
        }
        return new String(arr);
    }
    private boolean isVowel(char i){
        return "aeiouAEIOU".indexOf(i) != -1;
    }
}