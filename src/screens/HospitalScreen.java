package screens;

import healthCare.Hospital;

public class HospitalScreen implements screen{

	Hospital hospital;
	
	public HospitalScreen(Hospital h)
	{
		hospital = h;
	}
	
	public void display()
	{
		System.out.println("Are you a doctor or patient?");
	}
	
	public void handleExit()
	{
		System.out.println("Shutting down");
	}
	
}
