package com.reservation;
import java.util.Scanner;
public class ReservationSystem {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        // Login
        User loggedInUser = null;
        while (loggedInUser == null) {
            loggedInUser = loginSystem.login();
        }

        // Main system menu
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Make Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. View All Reservations");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reservationSystem.cancelReservation();
                    break;
                case 2:
                    reservationSystem.cancelReservation();
                    break;
                case 3:
                    reservationSystem.displayReservations();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        System.out.println("Thank you for using the Online Reservation System!");
    }

	private void displayReservations() {
		// TODO Auto-generated method stub
		
	}

	private void cancelReservation() {
		// TODO Auto-generated method stub
		
	}
}

