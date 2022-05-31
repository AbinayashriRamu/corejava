package com.chainsys.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapConvertArrayList {
     public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("Leela", 1);
            map.put("Murugesan", 2);
            map.put("Tree", 3);
            map.put("Lotus", 4);
            map.put("data", 5);
            
            List<String> listKeys = map.keySet().stream().collect(Collectors.toList());         
            for (String i : listKeys)
            {
                System.out.println(i);
            }
}

}