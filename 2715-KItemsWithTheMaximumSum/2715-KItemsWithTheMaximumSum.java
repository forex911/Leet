// Last updated: 5/25/2026, 11:07:14 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<numOnes){
            return k;
        }
        else if((numOnes+numZeros)<k){
            return numOnes-(k-(numOnes+numZeros));
        }
        else{
            return numOnes;
        }
    }
}