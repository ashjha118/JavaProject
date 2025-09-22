package javaclassandobject;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean booked;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.booked = false;
    }

    public void bookTicket() {
        if (!booked) {
            booked = true;
            System.out.println("Ticket booked successfully for seat " + seatNumber + "!");
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Status: " + (booked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket1 = new MovieTicket("Avengers", 5, 12.50);

        ticket1.displayTicket();
        System.out.println();

        ticket1.bookTicket();
        System.out.println();
        ticket1.displayTicket();

        System.out.print("\nTry booking again (yes/no)? ");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            ticket1.bookTicket();
        }

        sc.close();
    }
}
