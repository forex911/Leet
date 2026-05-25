// Last updated: 5/25/2026, 11:10:27 AM
class MedianFinder {
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> large;
    public MedianFinder() {
        small=new PriorityQueue<>(Collections.reverseOrder());
        large=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if( small.isEmpty() || num<=small.peek()){
            small.offer(num);
        }
        else{
            large.offer(num);
        }
        if(small.size()>large.size()+1){
            large.offer(small.poll());
        }
        if(large.size()>small.size()){
            small.offer(large.poll());
        }
    }
    
    public double findMedian() {
        if(small.size() > large.size()){
            return small.peek();
        }
        return ((double) small.peek()+large.peek())/2;

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */