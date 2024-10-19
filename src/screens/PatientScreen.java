package screens;

import healthCare.Patient;
import java.util.Scanner;

public class PatientScreen implements screen {

	Patient patient;
	Scanner scanner;

	public PatientScreen(Patient p) {
		patient = p;
		scanner = new Scanner(System.in);
	}

	@Override
	public boolean display() {
		System.out.println("Welcome, " + patient.getName());
		boolean exit = false;

		while (!exit) {
			System.out.println("Choose an option: \n1. View Prescriptions\n2. Exit");
			String input = scanner.nextLine();
			switch (input) {
				case "1":
					System.out.println("Prescriptions: " + patient.getPatientPrescription());
					break;
				case "2":
					exit = true;
					break;
				default:
					System.out.println("Invalid option. Please try again.");
					break;

			}
		}
		return true;
	}
}
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		return false;
	}

}
