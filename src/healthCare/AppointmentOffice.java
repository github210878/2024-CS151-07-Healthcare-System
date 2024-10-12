package healthCare;

public class AppointmentOffice extends Room{
	
	Doctor doctor;
	
	public AppointmentOffice()
	{
		doctor = null;		//empty office
	}

	public AppointmentOffice(Doctor physician)
	{
		doctor = physician;
	}
	
	public boolean appointDoctor(Doctor d)
	{
		if(doctor == null)
		{
			doctor = d;
			return true;
		} else
		{
			return false;
		}
	}
	
	public void vacateDoctor()
	{
		doctor = null;
	}

}
