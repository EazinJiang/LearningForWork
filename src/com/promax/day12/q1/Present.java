package com.promax.day12.q1;

import java.util.HashMap;
import java.util.Map;

public class Present {
    private Map<String, Integer> map = new HashMap<>();
    private Integer number = 100;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void sendPresent(){
        String name = Thread.currentThread().getName();
        if (!map.containsKey(name)) {
            map.put(name, 0);
        }
        synchronized (this){
            if (number <= 10){
                return;
            }else {
                number--;
                Integer count = map.get(name);
                count++;
                map.put(name, count);
            }
        }

    }
}
