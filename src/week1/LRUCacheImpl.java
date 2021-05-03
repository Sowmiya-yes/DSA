package week1;

import java.util.*;

class LRUCache {
    int size;
    Deque<Integer> dequeList;
    Set<Integer> hashTable;

    public LRUCache(int size) {
        this.size = size;
        this.dequeList = new LinkedList<>();
        this.hashTable = new HashSet<>();
    }

    void checkInCache(int x) {
        if(hashTable.contains(x)) {
            dequeList.remove(x);
            dequeList.push(x);
        } else {
            if(hashTable.size() == size) {
                int val = dequeList.removeLast();
                hashTable.remove(val);
            }
            dequeList.push(x);
            hashTable.add(x);
        }
    }

    void display() {
        Iterator<Integer> iterator = dequeList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

public class LRUCacheImpl {
    public static void main(String[] args) {
        LRUCache lruCache =  new LRUCache(4);
        lruCache.checkInCache(1);
        lruCache.display();
        lruCache.checkInCache(2);
        lruCache.display();
        lruCache.checkInCache(3);
        lruCache.display();
        lruCache.checkInCache(1);
        lruCache.display();
        lruCache.checkInCache(4);
        lruCache.display();
        lruCache.checkInCache(5);
        lruCache.display();
    }
}