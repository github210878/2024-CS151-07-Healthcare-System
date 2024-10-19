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
			System.out.println("Are you a doctor or patient?");
			input = inputScanner.next();
			if(input.equalsIgnoreCase("doctor"))
			{
				
			} else if(input.equalsIgnoreCase("patient"))
			{
				
			} else if(input.equalsIgnoreCase("exit"))
			{
				
			} else
			{
				System.out.println("Invalid input, please try again");
			}
		}
		
		
		
		
		return false;
		
	}
	
}
