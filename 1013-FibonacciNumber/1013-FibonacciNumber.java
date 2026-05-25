// Last updated: 5/25/2026, 11:08:32 AM
class Solution {
public static int fibo(int m){
    int fibon=0;
    if(m==0 || m==1){
        return m;
    }
    else{
         fibon=fibo(m-1)+fibo(m-2);
    }
    return fibon;
}

    public int fib(int n) {
       return fibo(n);
    }
}