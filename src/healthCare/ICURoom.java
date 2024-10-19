package healthCare;

public class ICURoom extends Room{
	
	private boolean isolation;
	private int levelOfCare;

	//Constructors
	public ICURoom(int i)
	{
		super(i);
		isolation = false;
		levelOfCare = 0;
	}

	public ICURoom(int i, int levelOfCare, boolean isolation) {
		super(i);
		this.levelOfCare = levelOfCare;
		this.isolation = isolation;
	}

	//Getters Setters
	public void setIsolation(boolean isolation) {
		this.isolation = isolation;
	}

	public boolean getIsolation() {
		return isolation;
	}

	public void setLevelOfCare(int levelOfCare) {
		this.levelOfCare = levelOfCare;
	}

	public int getLevelOfCare() {
		return levelOfCare;
	}
	
	// Method to simulate admitting a patient to an ICU Room
	@Override
	public boolean addPatients(int i) {
		if (super.addPatients(i)) {
			System.out.println("Patients added to ICU. Current population: " + getCurrentPopulation());
			return true;
		} else {
			System.out.println("ICU is at full capacity!");
			return false;
		}
	}

}
