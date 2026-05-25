// Last updated: 5/25/2026, 11:09:58 AM
class Solution {
    public String addStrings(String num1, String num2) {
        int n=num1.length()-1,m=num2.length()-1,sum,carry=0;
        StringBuilder res=new StringBuilder();
        while(n>=0 || m>=0 || carry>0 ){
            int n1=(n>=0)?num1.charAt(n--)-'0':0;
            int n2=(m>=0)?num2.charAt(m--)-'0':0;
            int ad=n1+n2+carry;
            res.append(ad%10);
            carry=ad/10;
        }
        return res.reverse().toString();
    }
}