package Proyectos.CacheLRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache <K, V> extends LinkedHashMap<K, V>{
    private int capacidad;

    public LRUCache(int capacidad) {

        super(capacidad, 0.75f, true);
        this.capacidad = capacidad;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacidad;
    }
}
