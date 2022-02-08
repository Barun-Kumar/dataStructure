package com.springerNature.model;

public class Ticket {
    private String from;
    private String to;
    private int travellersCount;
    private int ticketPrice;

    public Ticket(String from, String to, int ticketPrice, int travellersCount) {
        this.from = from;
        this.to = to;
        this.ticketPrice = ticketPrice;
        this.travellersCount=travellersCount;
    }

    public Ticket(String from, String to, int travellersCount) {
        this.from = from;
        this.to = to;
        this.travellersCount=travellersCount;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTravellersCount() {
        return travellersCount;
    }

    public void setTravellersCount(int travellersCount) {
        this.travellersCount = travellersCount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", travellersCount=" + travellersCount +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
