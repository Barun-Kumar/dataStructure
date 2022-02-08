package com.springerNature.service;

public class PriceCalculator {

    public int calculatePrice(String from, String to, int travellersCount){
        DistanceCalculatorService distanceCalculatorService = new DistanceCalculatorService();
        int distance=distanceCalculatorService.calculateDistance(from,to);
        int ticketPrice = 0;
        if(distance > 100) {
            ticketPrice = (750 + ((distance -100) * 5)) * travellersCount;
        }else {
            ticketPrice = 750 * travellersCount;
        }
         return ticketPrice;
    }
}
