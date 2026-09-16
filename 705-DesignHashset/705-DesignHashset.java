// Last updated: 9/16/2026, 2:06:40 PM
class MyHashSet {

    private final int SIZE = 10000;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
    }
    
    private int getIndex(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        if (buckets[index] != null) {
            buckets[index].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int index = getIndex(key);
        return buckets[index] != null && buckets[index].contains(key);
    }
}
