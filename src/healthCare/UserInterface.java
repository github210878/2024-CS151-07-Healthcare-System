package healthCare;

import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
	
	Scanner inputScanner;
	HealthCareSystem healthManager;

	public UserInterface(ArrayList<Hospital> list)
	{
		inputScanner = new Scanner(System.in);
		healthManager = new HealthCareSystem(list);
	}
	
	public void welcomeScreen()
	{
		System.out.println("Welcome to the Healthcare Network");
		
		ArrayList<Hospital> hospitalList = healthManager.hospitalList;
		
		while(true)
		{
			System.out.println("Please choose the Hospital you would like to visit:");
			
			for(int i = 1; i <= hospitalList.size(); i++)
			{
				System.out.println(i + ": " + hospitalList.get(i-1).name);
			}
			
			System.out.println(hospitalList.size()+1 + ": Create another hospital");
			
			int input = inputScanner.nextInt();
			
			for(int i = 1; i <= hospitalList.size(); i++)
			{
				if(i == input)
				{
					//to be coded --> we add methods accessing selected hospital here
				}
			} 
			if(input == hospitalList.size()+1)
			{
				//to be coded --> create a new hospital here
			} else
			{
				System.out.println("Invalid input, please try again:");
			}
			
		}
		
		
		
	}
	
	
	
	
}
