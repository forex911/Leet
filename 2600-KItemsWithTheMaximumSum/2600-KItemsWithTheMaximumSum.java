// Last updated: 9/16/2026, 2:01:09 PM
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