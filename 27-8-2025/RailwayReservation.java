package bridgeLab;

import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trainSeats = 0;   
        int fare = 0;         
        int bookedSeats = 0;  
        int waitingList = 0;  

        System.out.println("=== Welcome to Railway Reservation System ===");
        System.out.println("Choose your train:");
        System.out.println("1. Express (Seats: 5, Fare: 500)");
        System.out.println("2. Superfast (Seats: 3, Fare: 800)");
        System.out.println("3. Passenger (Seats: 7, Fare: 300)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                trainSeats = 5;
                fare = 500;
                System.out.println("You selected Express Train.");
                break;
            case 2:
                trainSeats = 3;
                fare = 800;
                System.out.println("You selected Superfast Train.");
                break;
            case 3:
                trainSeats = 7;
                fare = 300;
                System.out.println("You selected Passenger Train.");
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Passenger Train.");
                trainSeats = 7;
                fare = 300;
        }

        do {
            System.out.print("\nEnter number of passengers to book: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                if (bookedSeats < trainSeats) {
                    bookedSeats++;
                    System.out.println("Seat confirmed for Passenger " + i +
                                       " | Seat No: " + bookedSeats +
                                       " | Fare: " + fare);
                } else {
                    waitingList++;
                    System.out.println("Passenger " + i +
                                       " added to Waiting List | WL No: " + waitingList);
                }
            }

            while (bookedSeats >= trainSeats) {
                System.out.println("\nAll seats are booked! Only waiting list available.");
                break;
            }

            System.out.print("\nDo you want to book more tickets? (yes=1 / no=0): ");
        } while (sc.nextInt() == 1);

        System.out.println("\n=== Reservation Summary ===");
        System.out.println("Seats Booked: " + bookedSeats + "/" + trainSeats);
        System.out.println("Waiting List: " + waitingList);
        System.out.println("Thank you for using Railway Reservation System!");
        
        sc.close();
    }
}

