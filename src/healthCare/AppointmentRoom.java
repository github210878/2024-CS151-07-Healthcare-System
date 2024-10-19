package healthCare;

import java.util.ArrayList;
import java.util.List;

public class AppointmentRoom extends Room {

	private List<String> appointments; // A list of appointment times or appointment IDs
	private String assignedDoctor;     // The doctor assigned to this room
	private List<String> availableTimeSlots; // List of available time slots for the room

	// Default constructor
	public AppointmentRoom() {
		super();
		this.appointments = new ArrayList<>();
		this.availableTimeSlots = new ArrayList<>();
		this.assignedDoctor = "Unassigned";
		initializeTimeSlots(); // Initialize default time slots
	}

	// Constructor with capacity and doctor assignment
	public AppointmentRoom(int max, String doctor) {
		super(max);
		this.appointments = new ArrayList<>();
		this.availableTimeSlots = new ArrayList<>();
		this.assignedDoctor = doctor;
		initializeTimeSlots();
	}

	// Initialize the default available time slots 24 hours
	private void initializeTimeSlots() {
		this.availableTimeSlots.add("11:00 PM - 12:00 AM");
		this.availableTimeSlots.add("12:00 AM - 1:00 AM");
		this.availableTimeSlots.add("1:00 AM - 2:00 AM");
		this.availableTimeSlots.add("2:00 AM - 3:00 AM");
		this.availableTimeSlots.add("3:00 AM - 4:00 AM");
		this.availableTimeSlots.add("4:00 AM - 5:00 AM");
		this.availableTimeSlots.add("5:00 AM - 6:00 AM");
		this.availableTimeSlots.add("6:00 AM - 7:00 AM");
		this.availableTimeSlots.add("7:00 AM - 8:00 AM");
		this.availableTimeSlots.add("8:00 AM - 9:00 AM");
		this.availableTimeSlots.add("9:00 AM - 10:00 AM");
		this.availableTimeSlots.add("10:00 AM - 11:00 AM");
		this.availableTimeSlots.add("11:00 AM - 12:00 PM");
		this.availableTimeSlots.add("12:00 PM - 1:00 PM");
		this.availableTimeSlots.add("1:00 PM - 2:00 PM");
		this.availableTimeSlots.add("2:00 PM - 3:00 PM");
		this.availableTimeSlots.add("3:00 PM - 4:00 PM");
		this.availableTimeSlots.add("4:00 PM - 5:00 PM");
		this.availableTimeSlots.add("5:00 PM - 6:00 PM");
		this.availableTimeSlots.add("6:00 PM - 7:00 PM");
		this.availableTimeSlots.add("7:00 PM - 8:00 PM");
		this.availableTimeSlots.add("8:00 PM - 9:00 PM");
		this.availableTimeSlots.add("9:00 PM - 10:00 PM");
		this.availableTimeSlots.add("10:00 PM - 11:00 PM");

	}

	// Method to schedule an appointment
	public boolean scheduleAppointment(String timeSlot) {
		if (availableTimeSlots.contains(timeSlot)) {
			appointments.add(timeSlot);
			availableTimeSlots.remove(timeSlot);
			System.out.println("Appointment scheduled at " + timeSlot);
			return true;
		} else {
			System.out.println("Time slot unavailable or already booked.");
			return false;
		}
	}

	// Method to cancel an appointment
	public boolean cancelAppointment(String timeSlot) {
		if (appointments.contains(timeSlot)) {
			appointments.remove(timeSlot);
			availableTimeSlots.add(timeSlot);
			System.out.println("Appointment at " + timeSlot + " has been canceled.");
			return true;
		} else {
			System.out.println("No appointment found at this time.");
			return false;
		}
	}

	// Getters and Setters
	public List<String> getAppointments() {
		return appointments;
	}

	public String getAssignedDoctor() {
		return assignedDoctor;
	}

	public void setAssignedDoctor(String assignedDoctor) {
		this.assignedDoctor = assignedDoctor;
	}

	public List<String> getAvailableTimeSlots() {
		return availableTimeSlots;
	}

	// Override the addPatients method to respect the capacity
	@Override
	public boolean addPatients(int i) {
		if (super.addPatients(i)) {
			System.out.println("Patients added to the appointment room. Current population: " + getCurrentPopulation());
			return true;
		} else {
			System.out.println("Appointment room is at full capacity!");
			return false;
		}
	}
}
