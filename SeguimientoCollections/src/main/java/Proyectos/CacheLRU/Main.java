package Proyectos.CacheLRU;

public class Main {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println(cache);

        cache.get(1);
        System.out.println(cache);

        cache.put(4, "D");
        System.out.println(cache);
    }
}
