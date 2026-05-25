// Last updated: 5/25/2026, 11:08:59 AM
class MyHashMap {
    private static class Node {
        int key;
        int value;
        Node next;
        Node(int k, int v) { key = k; value = v; next = null; }
    }

    private final Node[] dataMap;
    private final int capacity;

    public MyHashMap() {
        this.capacity = 10007;          // choose a prime-ish bucket count
        this.dataMap = new Node[capacity];
    }

    private int hash(int key) {
        return (key & 0x7fffffff) % capacity;
    }

    // Your style: create newNode, if bucket null set it, otherwise walk and append.
    public void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataMap[index] == null) {
            // empty bucket -> set head to new node
            dataMap[index] = newNode;
            return;
        } else {
            // traverse to end; if key exists update, otherwise append
            Node temp = dataMap[index];
            while (temp != null) {
                if (temp.key == key) {
                    // update existing key (prevents duplicates)
                    temp.value = value;
                    return;
                }
                if (temp.next == null) break; // stop at last node
                temp = temp.next;
            }
            // append new node at end
            temp.next = newNode;
        }
    }

    public int get(int key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return -1; // not found
    }

    public void remove(int key) {
        int index = hash(key);
        Node head = dataMap[index];
        if (head == null) return;

        // if head needs removal
        if (head.key == key) {
            dataMap[index] = head.next;
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.key == key) {
                prev.next = curr.next; // unlink
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        // not found -> nothing to do
    }
}

/**
 * Example:
 * MyHashMap map = new MyHashMap();
 * map.put(1, 100);
 * map.put(1, 200); // updates value at key 1 to 200
 * int v = map.get(1); // 200
 * map.remove(1);
 * int missing = map.get(1); // -1
 */