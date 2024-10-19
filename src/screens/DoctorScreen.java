package screens;

import healthCare.Doctor;

public class DoctorScreen implements screen{
	
	Doctor doctor;
	
	public DoctorScreen(Doctor d)
	{
		doctor = d;
	}

	@Override
	public boolean display() {
		// TODO Auto-generated method stub
		return false;
	}

}
