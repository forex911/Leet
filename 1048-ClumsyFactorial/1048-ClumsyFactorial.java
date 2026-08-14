// Last updated: 8/14/2026, 10:45:32 AM
class Solution {
    public int clumsy(int n) {
        int ans=0;
        int counter=0;
        Stack<Integer> store=new Stack<>();
        store.push(n);
        n--;
        while(n>0){
            int c=counter%4;
            if(c==0){
                int tem=store.pop();
                tem=tem*n;
                store.push(tem);
            }
            if(c==1){
                int tem=store.pop();
                tem=tem/n;
                store.push(tem);
            }
            if(c==2){
                store.push(n);
            }
            if(c==3){
                store.push(-n);
            }
            n--;
            counter++;
        }
        while(!store.isEmpty()){
            ans+=store.pop();
        }
        return ans;
    }
}