// Last updated: 9/16/2026, 2:05:30 PM
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