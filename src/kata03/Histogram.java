/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata03;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author G10
 */
public class Histogram<T> {
    private final Map<T, Integer> map = new HashMap<>();
    
    public Integer get(T key) {
        return this.map.get(key);
    }
    
    public Set<T> keySet() {
        return this.map.keySet();
    }
    
    public void increment(T key) {
        // throw new UnsupportedOperationException("Not supported yet.");
        this.map.put(key, map.containsKey(key) ? this.get(key) + 1 : 1);
    }
}