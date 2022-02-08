package com.springerNature.service;

import com.springerNature.dao.DistanceRepository;

import java.util.HashMap;
import java.util.Map;

public class DistanceCalculatorService {


    public int calculateDistance(String from, String to ){
        DistanceRepository distanceRepository = new DistanceRepository();
        return distanceRepository.getDistance(from,to);
    }



}
