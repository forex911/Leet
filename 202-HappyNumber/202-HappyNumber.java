// Last updated: 5/25/2026, 11:11:06 AM
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> check=new HashSet<>();
        while(n!=1){
            if(check.contains(n)){
                return false;
            }
            check.add(n);
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}