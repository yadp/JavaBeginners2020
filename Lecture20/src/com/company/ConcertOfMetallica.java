package com.company;

public class ConcertOfMetallica {
    public static final int MAX_TICKETS=1000;
    private static int ticketsSold = 0;

    private String nameOfSeller;

    public ConcertOfMetallica(String nameOfSeller) {
        this.nameOfSeller= nameOfSeller;
    }

    public String getNameOfSeller() {
        return nameOfSeller;
    }

    public void setNameOfSeller(String nameOfSeller) {
        this.nameOfSeller = nameOfSeller;
    }

    public boolean sellTicket ( int tickets){

        if(ticketsSold+ tickets <= MAX_TICKETS){

            ticketsSold+=tickets;
            return true;
        } else {
            return false;
        }
    }



    public static int getTicketsSold() {
        return ticketsSold;
    }


}

