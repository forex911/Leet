// Last updated: 5/25/2026, 11:09:53 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int[] counts=new int[26];
        int[] countp=new int[26];
        int k=p.length();
        if (s.length() < k) return res;
        // for(char c:p.toCharArray()){
        //     countp[c-'a']++;
        // }
        for(int i=0;i<k;i++){
            char c=p.charAt(i);
            countp[c-'a']++;
        }
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            counts[c-'a']++;
        }
        if(Arrays.equals(countp,counts)){
            res.add(0);
        }
        for(int i=k;i<s.length();i++){
            char add = s.charAt(i);
            char remove = s.charAt(i - k);

            counts[add - 'a']++;        
            counts[remove - 'a']--;
            if(Arrays.equals(countp,counts)){
            res.add(i-k+1);
        }
        }
        return res;
    }
}