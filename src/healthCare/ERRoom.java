package healthCare;

public class ERRoom extends Room {

	private boolean hasEmergencyEquipment;
	private int emergencyPriority;

	// Default constructor
	public ERRoom() {
		super();
		this.hasEmergencyEquipment = true;  // Assuming ER has emergency equipment by default
		this.emergencyPriority = 1;         // Highest priority for emergencies
	}

	// Constructor with capacity and priority
	public ERRoom(int max, int emergencyPriority) {
		super(max);
		this.hasEmergencyEquipment = true;  // ER must always have emergency equipment
		this.emergencyPriority = emergencyPriority;
	}

	// Method to handle emergency
	public void handleEmergency() {
		if (hasEmergencyEquipment) {
			System.out.println("Emergency equipment is ready.");
			// Logic to handle emergency cases
		} else {
			System.out.println("No emergency equipment available.");
		}
	}

	// Getters and Setters
	public boolean hasEmergencyEquipment() {
		return hasEmergencyEquipment;
	}

	public void setEmergencyEquipment(boolean hasEmergencyEquipment) {
		this.hasEmergencyEquipment = hasEmergencyEquipment;
	}

	public int getEmergencyPriority() {
		return emergencyPriority;
	}

	public void setEmergencyPriority(int emergencyPriority) {
		this.emergencyPriority = emergencyPriority;
	}

	// Method to simulate admitting a patient in an emergency scenario
	@Override
	public boolean addPatients(int i) {
		if (super.addPatients(i)) {
			System.out.println("Patients added to ER. Current population: " + getCurrentPopulation());
			return true;
		} else {
			System.out.println("ER is at full capacity!");
			return false;
		}
	}
}
