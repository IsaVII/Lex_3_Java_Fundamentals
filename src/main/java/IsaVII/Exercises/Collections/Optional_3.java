package IsaVII.Exercises.Collections;


import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public class Optional_3 extends Exercise {
    /*
   Implement a simple Least Recently Used (LRU) cache with a fixed capacity of 3.

    put(key, value) — add an entry. If full, evict the least recently used entry first.
    get(key) — return the value, or -1 if not found. A successful get counts as a recent use.
    put(1, "A")  → cache: {1=A}
    put(2, "B")  → cache: {1=A, 2=B}
    put(3, "C")  → cache: {1=A, 2=B, 3=C}
    get(1)       → "A",  cache: {2=B, 3=C, 1=A}
    put(4, "D")  → evict 2, cache: {3=C, 1=A, 4=D}
    Think about it: Which Java collection maintains insertion order and gives you control over eviction?
     */

    @Override
    public void run() {
        exerciseNumber = 20;
        super.run();
        
        LRUCache cache = new LRUCache(3);
        cache.put(1, "A");
        cache.printCache();
        cache.put(2, "B");
        cache.printCache();
        cache.put(3, "C");
        cache.printCache();
        cache.get(1);
        cache.printCache();
        cache.put(4, "D");
        cache.printCache();
    }
    
    public class LRUCache {
        private final int capacity;
        private final LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be positive");
            }
            this.capacity = capacity;
        }

        public String get(int key) {
            if (!map.containsKey(key)) {
                return "-1";
            }

            String value = map.remove(key);
            map.put(key, value);
            return value;
        }

        public void put(int key, String value) {
            if (map.containsKey(key)) {
                map.remove(key);         
            } else if (map.size() == capacity) {
                map.pollFirstEntry();   
            }
            map.put(key, value);
        }

        @Override
        public String toString() {
            return map.toString();
        }
        
        public void printCache() {
           IO.println("Current cache: " + map);
        }
    }
}
