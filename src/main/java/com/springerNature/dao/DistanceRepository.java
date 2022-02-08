package com.springerNature.dao;

import java.util.HashMap;
import java.util.Map;

public class DistanceRepository {

    public int getDistance(String from, String to) {
    Map<String, Integer> distances = new HashMap<>();
        distances.put("MUMBAI-PUNE",120);
        distances.put("MUMBAI-GOA",350);
        distances.put("MUMBAI-NASIK",180);
        distances.put("PUNE-NASIK",200);

        Integer distance = distances.get(from + "-" + to);
        if(distance == null){
            distance = distances.get(to + "-" + from);
        }
        return distance;
}
}
