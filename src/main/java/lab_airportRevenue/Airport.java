package labs.lab1_airportRevenue;

public class Airport {
    private String airportName;
    private double ticketCost;
    private int totalSeatCount;
    private int soldTicketsCount;


    public Airport (String airportName, double ticketCost, int  totalSeatCount, int soldTicketsCount) {
        this.airportName = airportName;
        this.ticketCost = ticketCost;
        this.totalSeatCount = totalSeatCount;
        this.soldTicketsCount = soldTicketsCount;
    }


    public double calculateTotalRevenue() {
        return soldTicketsCount * ticketCost;
    }


    public String getAirportName() {
        return airportName;
    }
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }


    public double getTicketCost() {
        return ticketCost;
    }
    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }


    public void setTotalSeatCount(int totalSeatCount) {
        this.totalSeatCount = totalSeatCount;
    }


    public void setSoldTicketsCount(int soldTicketsCount) {
        this.soldTicketsCount = soldTicketsCount;
    }
}




