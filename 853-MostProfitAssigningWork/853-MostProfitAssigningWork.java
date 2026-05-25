// Last updated: 5/25/2026, 11:08:52 AM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        int [][] jobs=new int[n][2];
        for(int i=0;i<n;i++){
            jobs[i][0]=difficulty[i];
            jobs[i][1]=profit[i];
        }
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Arrays.sort(worker);
        int max=0;
        int ind=0;
        int res=0;
        for(int i=0;i<worker.length;i++){
            
            while (ind < n && jobs[ind][0] <= worker[i]) {
                max = Math.max(max, jobs[ind][1]);
                ind++;
            }
            res+=max;
        }
        return res;
    }
}