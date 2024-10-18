package screens;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class UserInterface {

    public static void main(String[] args) {

        Patient currentPatient = null;
        Doctor currentDoctor = null;
        String userType, userID, doctorID, patientID, visitPurpose, roomType;
        int tempSelectedNumber = 0;
        String tempInput;

        // start of the program
        System.out.println("Hello, Welcome to the Healthcare Management System!");
        System.out.println("Developed by Team ____");

        Scanner input = new Scanner(System.in);
        int exitCode = -1;

        // Login as Patient or Doctor
        while (true) {
            System.out.println();
            System.out.println("Please select from the following options:");
            System.out.println("A. Login as a Patient");
            System.out.println("B. Login as a Doctor");
            System.out.println();
            tempInput = input.nextLine();
            if (tempInput.isEmpty()) {
                System.out.println("Invalid menu option. Please enter A or B.");
                continue;
            }

            switch (Character.toUpperCase(tempInput.charAt(0))) {
                case 'A':  // Patient Login
                    System.out.println();
                    System.out.print("Please enter your Patient ID: ");
                    userID = input.nextLine();
                    currentPatient = AccountManager.searchPatientByID(userID);
                    if (currentPatient != null) {
                        System.out.println("Welcome, " + currentPatient.getName() + "!");
                        exitCode = 1;
                        break;
                    } else {
                        System.out.println("Sorry, patient not found.");
                    }
                    break;

                case 'B':  // Doctor Login
                    System.out.println();
                    System.out.print("Please enter your Doctor ID: ");
                    userID = input.nextLine();
                    currentDoctor = AccountManager.searchDoctorByID(userID);
                    if (currentDoctor != null) {
                        System.out.println("Welcome, Dr. " + currentDoctor.getName() + "!");
                        exitCode = 1;
                        break;
                    } else {
                        System.out.println("Sorry, doctor not found.");
                    }
                    break;

                default:
                    System.out.println("Invalid menu option. Please enter A or B.");
                    break;
            }

            if (exitCode == 1) {
                break;
            }
        }

        // Patient Actions Menu
        if (currentPatient != null) {
            while (true) {
                System.out.println();
                System.out.println("Patient Menu:");
                System.out.println("A. View My Reservations");
                System.out.println("B. Book a New Appointment");
                System.out.println("C. Cancel an Appointment");
                System.out.println("X. Logout");
                System.out.println();

                System.out.print("Enter your choice: ");
                tempInput = input.nextLine();
                if (tempInput.isEmpty()) {
                    System.out.println("Invalid menu option. Please enter A-C or X to logout.");
                    continue;
                }

                switch (Character.toUpperCase(tempInput.charAt(0))) {
                    case 'A':
                        currentPatient.viewReservations();
                        break;

                    case 'B':
                        System.out.print("Enter the doctor ID you want to book an appointment with: ");
                        doctorID = input.nextLine();
                        Doctor doctor = AccountManager.searchDoctorByID(doctorID);
                        if (doctor != null) {
                            System.out.print("Enter the visit purpose: ");
                            visitPurpose = input.nextLine();
                            System.out.print("Enter the desired room type (e.g., ER, ICU): ");
                            roomType = input.nextLine();
                            Date appointmentDate = new Date(); // Here, you can implement a real date entry system
                            Reservation newReservation = new Reservation(appointmentDate, currentPatient, visitPurpose, doctor);
                            Reservation.addReservation(newReservation);
                            System.out.println("Appointment successfully booked!");
                        } else {
                            System.out.println("Doctor not found.");
                        }
                        break;

                    case 'C':
                        currentPatient.viewReservations();  // Display reservations for reference
                        System.out.print("Enter the number of the reservation to cancel: ");
                        tempSelectedNumber = Integer.parseInt(input.nextLine());
                        Reservation reservationToCancel = currentPatient.getReservationByIndex(tempSelectedNumber);
                        if (reservationToCancel != null) {
                            Reservation.removeReservation(reservationToCancel);
                            System.out.println("Reservation canceled successfully.");
                        } else {
                            System.out.println("Reservation not found.");
                        }
                        break;

                    case 'X':
                        exitCode = 1;
                        break;

                    default:
                        System.out.println("Invalid menu option. Please enter A-C or X to logout.");
                        break;
                }

                if (exitCode == 1) {
                    break;
                }
            }
        }

        // Doctor Actions Menu
        if (currentDoctor != null) {
            while (true) {
                System.out.println();
                System.out.println("Doctor Menu:");
                System.out.println("A. View My Patients");
                System.out.println("B. View My Appointments");
                System.out.println("C. Change Appointment Date");
                System.out.println("X. Logout");
                System.out.println();

                System.out.print("Enter your choice: ");
                tempInput = input.nextLine();
                if (tempInput.isEmpty()) {
                    System.out.println("Invalid menu option. Please enter A-C or X to logout.");
                    continue;
                }

                switch (Character.toUpperCase(tempInput.charAt(0))) {
                    case 'A':
                        currentDoctor.viewPatients();
                        break;

                    case 'B':
                        currentDoctor.viewAppointments();
                        break;

                    case 'C':
                        currentDoctor.viewAppointments();  // Display appointments for reference
                        System.out.print("Enter the number of the appointment to change: ");
                        tempSelectedNumber = Integer.parseInt(input.nextLine());
                        Reservation reservationToChange = currentDoctor.getAppointmentByIndex(tempSelectedNumber);
                        if (reservationToChange != null) {
                            System.out.print("Enter the new date (as a Date object or formatted input): ");
                            // Assuming real date input or a custom parser
                            Date newDate = new Date(); // Placeholder
                            reservationToChange.switchDate(newDate);
                            System.out.println("Appointment date changed successfully.");
                        } else {
                            System.out.println("Appointment not found.");
                        }
                        break;

                    case 'X':
                        exitCode = 1;
                        break;

                    default:
                        System.out.println("Invalid menu option. Please enter A-C or X to logout.");
                        break;
                }

                if (exitCode == 1) {
                    break;
                }
            }
        }

        System.out.println("Goodbye!");
        input.close();
    }
}
