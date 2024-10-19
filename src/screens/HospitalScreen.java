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
		inputScanner = new Scanner(System.in);
	}
	
	public boolean display()
	{
		
		boolean exit = false;
		while(!exit)
		{
			System.out.println("Are you a doctor or patient? Type 'back' to go back");
			input = inputScanner.next();
			if(input.equalsIgnoreCase("doctor"))
			{
				System.out.println("Type your name");
				input = inputScanner.next();
				if(hospital.getDoctor(input) != null)
				{
					
				} else
				{
					System.out.println("Invalid input, please try again");
				}
			} else if(input.equalsIgnoreCase("patient"))
			{
				System.out.println("Type your name");
			} else if(input.equalsIgnoreCase("exit"))
			{
				exit = true;
			} else if(input.equalsIgnoreCase("back"))
			{
				return true;
			}else
			{
				System.out.println("Invalid input, please try again");
			}
		}
		
		
		
		
		return false;
		
	}
	
}
