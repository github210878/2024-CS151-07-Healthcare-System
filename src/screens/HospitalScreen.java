package screens;

import java.util.Scanner;

import healthCare.Hospital;

public class HospitalScreen implements screen{

	Hospital hospital;
	Scanner inputScanner;
	String input;
	
	public HospitalScreen(Hospital h)
	{
		hospital = h;
		
	}
	
	public boolean display()
	{
		
		boolean exit = false;
		while(!exit)
		{
			
			inputScanner = new Scanner(System.in);
			System.out.println("Input 'patient' for the patient page or input 'doctor' for the employee page. At any time type 'back' to go back");
			
			input = inputScanner.next();
			if(input.equalsIgnoreCase("doctor"))
			{
				System.out.println("Type your name");
				input = inputScanner.next();
				if(hospital.getDoctor(input) != null)
				{
					inputScanner.close();
					DoctorScreen s = new DoctorScreen(hospital.getDoctor(input));
					exit = s.display();
				} else if(input.equalsIgnoreCase("exit"))
				{
					exit = true;
					return true;
				}
			} else if(input.equalsIgnoreCase("patient"))
			{
				System.out.println("Type your name");
				input = inputScanner.next();
				if(hospital.getPatient(input) != null)
				{
					inputScanner.close();
					PatientScreen s = new PatientScreen(hospital.getPatient(input));
					exit = s.display();
				} else if(input.equalsIgnoreCase("exit"))
				{
					exit = true;
					return true;
				}
			} else if(input.equalsIgnoreCase("exit"))
			{
				exit = true;
				
			} else if(input.equalsIgnoreCase("back"))
			{
				return false;
			}else
			{
				System.out.println("Invalid input, please try again");
			}
			
			inputScanner.close();
		}
		
		
		
		
		return true;
		
	}
	
}
