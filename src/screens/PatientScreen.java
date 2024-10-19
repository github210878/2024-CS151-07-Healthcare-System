package screens;

import java.util.Scanner;

import healthCare.Medication;
import healthCare.Patient;

public class PatientScreen implements screen{
	
	Scanner inputScanner;
	String input;

	Patient patient;
	public PatientScreen(Patient p)
	{
		patient = p;
		inputScanner = new Scanner(System.in);
	}

	@Override
	public boolean display() {
		
		boolean exit = false;
		
		while(!exit)
		{
			if(patient.getRefillNotification())
			{
				System.out.println("It's time to refill your medication! \n");
			}
			
			System.out.println("Hello " + patient.getName() + ", How can we help you?");
			System.out.println("Type 'Prescription' to check prescription status");
			System.out.println("Type 'Profile' to view your profile");
			
			System.out.println("Type 'Back' to go back");
			
			input = inputScanner.next();
			
			if(input.equalsIgnoreCase("prescription"))
			{
				if(patient.getPatientPrescription().size() == 0)
				{
					System.out.println("You currently have no prescriptions");
				} else
				{
					for(Medication m : patient.getPatientPrescription())
					{
						System.out.println("You have a prescription for " + m.getMedicationName());
						System.out.println("Info: ");
						System.out.println(m.medicationInfo());
					}
				}
			} else if(input.equalsIgnoreCase("profile"))
			{
				System.out.println(patient.viewProfile());
			} else if(input.equalsIgnoreCase("exit"))
			{
				return true;
			} else if(input.equalsIgnoreCase("back"))
			{
				return false;
			} else
			{
				System.out.println("Unrecognized input, please try again");
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		return true;
	}

}
