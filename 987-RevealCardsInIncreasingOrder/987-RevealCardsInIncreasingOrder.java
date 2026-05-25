// Last updated: 5/25/2026, 11:08:35 AM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int[] result=new int[n];
        Deque<Integer> ind=new LinkedList<>();
        for(int i=0;i<n;i++){
            ind.add(i);
        }
        for(int val:deck){
            int in=ind.poll();
            result[in]=val;
            if(!ind.isEmpty()){
                ind.add(ind.poll());
            }
        }
        return result;
    }
}