package healthCare;
import java.util.ArrayList;

public class Hospital {
	
	private String name;
	private String address;
	private String contactInfo;
	private ArrayList<Staff> staff = new ArrayList<Staff>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private ArrayList<Room> rooms = new ArrayList<Room>();
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

	//Constructors
	Hospital() {
		name = null;
		address = null;
		contactInfo = null;
	}

	Hospital(String name, String address, String contactInfo) {
		this.name = name;
		this.address = address;
		this.contactInfo = contactInfo;
	}

	//adds doctor to hospital list
	//returns true if doctor was added, false if doctor already exists.
	public boolean addDoctor(Doctor doctor) {
		if (staff.contains(doctor)) return false;
		staff.add(doctor);
		return true;
	}

	//adds doctor from hospital list
	//returns true if doctor was removed, false if doctor does not exist in the hospital.
	public boolean removeDoctor(Doctor doctor) {
		if (!staff.contains(doctor)) return false;
		staff.remove(doctor);
		return true;
	}

	//adds patient to hospital list
	//returns true if patient was added, false if patient already exists.
	public boolean addPatient(Patient patient) {
		if (patients.contains(patient)) return false;
		patients.add(patient);
		return true;
	}

	//removes patients from hospital list
	//returns true if patient was removed, false if patient does not exist in the hospital.
	public boolean removePatient(Patient patient) {
		if (!patients.contains(patient)) return false;
		patients.remove(patient);
		return true;
	}

	public boolean addReservation(Reservation reservation) {
		if (reservations.contains(reservation)) return false;
		reservations.remove(reservation);
		return true;
	}

	public boolean removeReservation(Reservation reservation) {
		if (!reservations.contains(reservation)) return false;
		reservations.remove(reservation);
		return true;
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public boolean removeRoom(Room room) {
		if (!rooms.contains(room)) return false;
		rooms.remove(room);
		return true;
	}

	//returns # of empty rooms
	public int emptyRooms() {
		int count = 0;
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getCurrentPopulation() == 0) {
				count++;
			}
		}
		return count;
	}
}