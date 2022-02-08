package com.springerNature.app;

import com.springerNature.model.Ticket;
import com.springerNature.service.PriceCalculator;

public class App {

    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println("Hello Taxi Ticket System");
        System.out.println("Taxi Ticket\n-----------");
        String from = "GOA";
        String to = "MUMBAI";
        int travellersCount = 2;

        Ticket ticket = new Ticket(from,to,travellersCount);

        int ticketPrice=priceCalculator.calculatePrice(from,to,travellersCount);
        System.out.println("Source: " + from);
        System.out.println("Destination: " + to);
        System.out.println("No. of travellers = " + travellersCount);
        System.out.println("Ticket Price ="+ticketPrice);

    }
}
