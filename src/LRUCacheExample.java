import java.util.*;

class Nodes {
    int key;
    int value; // Storing integer parsed from the string
    Nodes prev, next;

    public Nodes(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class DoubleLinkedList {
    Nodes head, tail;

    public DoubleLinkedList() {
        this.head = new Nodes(0, 0);
        this.tail = new Nodes(0, 0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    // Insert right after the dummy head (Most Recently Used)
    public void insertNodeAtBegining(Nodes node) {
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    // Delete a specific node from anywhere in the list
    public void deleteNode(Nodes node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Identifies and returns the actual last node (Least Recently Used)
    public Nodes getLastNode() {
        if (head.next == tail) {
            return null; // List is empty
        }
        return tail.prev;
    }
}

class LRUCache {
    int maxCapacity;
    // Maps the key to the Node object so we can access list pointers in O(1)
    HashMap<Integer, Nodes> hashmap;
    DoubleLinkedList doubleLinkedList;

    public LRUCache(int capacity) {
        this.maxCapacity = capacity;
        this.hashmap = new HashMap<>();
        this.doubleLinkedList = new DoubleLinkedList();
    }

    public String get(int key) {
        if (!hashmap.containsKey(key)) {
            return "-1";
        }
        Nodes node = hashmap.get(key);
        // Move the accessed node to the beginning (mark as MRU)
        doubleLinkedList.deleteNode(node);
        doubleLinkedList.insertNodeAtBegining(node);
        return String.valueOf(node.value);
    }

    public void put(int key, String value) {
        int intValue = Integer.parseInt(value);

        if (hashmap.containsKey(key)) {
            // Key exists: update its value and move to front
            Nodes node = hashmap.get(key);
            node.value = intValue;
            doubleLinkedList.deleteNode(node);
            doubleLinkedList.insertNodeAtBegining(node);
        } else {
            // Key is new: check capacity limits
            if (hashmap.size() >= maxCapacity) {
                // Get the oldest node, remove from list, and evict from map
                Nodes lru = doubleLinkedList.getLastNode();
                if (lru != null) {
                    doubleLinkedList.deleteNode(lru);
                    hashmap.remove(lru.key);
                }
            }
            // Create new node, insert to list, and add to map
            Nodes newNode = new Nodes(key, intValue);
            doubleLinkedList.insertNodeAtBegining(newNode);
            hashmap.put(key, newNode);
        }
    }
}

public class LRUCacheExample {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);

        lruCache.put(1, "100");
        lruCache.put(2, "200");
        lruCache.put(3, "300");

        System.out.println("Get 1: " + lruCache.get(1)); // Returns 100, moves 1 to front

        lruCache.put(4, "400"); // Evicts key 2 because 1 was recently accessed!

        System.out.println("Get 2 (Evicted): " + lruCache.get(2)); // Returns -1
        System.out.println("Get 3: " + lruCache.get(3)); // Returns 300
    }
}