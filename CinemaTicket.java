class CinemaTicket {
    String Name;
    String Movie;
    int Price;
    int Ticket;
    CinemaTicket(String Name, String Movie, int Price, int Ticket) {
        this.Name = Name;
        this.Movie = Movie;
        this.Price = Price;
        this.Ticket = Ticket;
    }
    CinemaTicket(String Name, String Movie, int Price) {
        this(Name, Movie, Price, 1);
    }
    boolean verifyCustomer(String checkName) {
        return this.Name.equalsIgnoreCase(checkName);
    }
    void display() {
        System.out.println("CINEMA TICKET BOOKING");
        if (Ticket <= 0) {
            System.out.println("Invalid number of tickets!");
            return;
        }
        double total = Price * Ticket;
        double discount = 0;
        if (Ticket >= 5) {
            discount = total * 0.10;
        }
        double finalAmount = total - discount;
        System.out.println("Customer Name   : " + Name.toUpperCase());
        System.out.println("Movie Name      : " + Movie.toUpperCase());
        System.out.println("Ticket Price    : Rs. " + Price + ".00");
        System.out.println("Number of Tickets: " + Ticket);
        System.out.println("Booking Status  : Booking Successful");
        System.out.println("Total Amount    : Rs. " + total + "0");
        System.out.println("Discount        : Rs. " + discount + "0");
        System.out.println("Final Amount    : Rs. " + finalAmount + "0");
    }
    public static void main(String[] args) {
        CinemaTicket booking = new CinemaTicket("sneha", "avatar", 200, 5);
        booking.display();
    }
}