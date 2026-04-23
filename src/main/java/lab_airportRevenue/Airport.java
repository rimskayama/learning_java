package labs.lab1_airportRevenue;

public class Airport {
    private String airportName;
    private double ticketCost;
    private int totalSeatCount;
    private int soldTicketsCount;

    public Airport(String airportName, double ticketCost, int totalSeatCount, int soldTicketsCount) {
        this.airportName = airportName;
        setTicketCost(ticketCost);
        this.totalSeatCount = totalSeatCount;
        setSoldTicketsCount(soldTicketsCount);
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
        if (ticketCost <= 0) {
            throw new IllegalArgumentException("Цена должна быть больше нуля");
        }
        this.ticketCost = ticketCost;
    }

    public int getSoldTicketsCount() {
        return soldTicketsCount;
    }
    public void setSoldTicketsCount(int soldTicketsCount) {
        if (soldTicketsCount <= 0) {
            throw new IllegalArgumentException("Число проданных билетов должно быть больше нуля");
        }
        if (soldTicketsCount > this.totalSeatCount) {
            throw new IllegalArgumentException(
                    "Проданных билетов не может быть больше мест (" + this.totalSeatCount + ")"
            );
        }
        this.soldTicketsCount = soldTicketsCount;
    }

    public void setTotalSeatCount(int totalSeatCount) {
        this.totalSeatCount = totalSeatCount;
    }
}




