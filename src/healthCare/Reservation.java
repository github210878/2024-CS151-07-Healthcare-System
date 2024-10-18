package healthCare;

import java.util.Date;

public class Reservation {
    private Date date;
    private Patient patient;
    private String reason;
    private Doctor doctor;

    // Constructor
    public Reservation(Date date, Patient patient, String reason, Doctor doctor) {
        this.date = date;
        this.patient = patient;
        this.reason = reason;
        this.doctor = doctor;
    }

    // Getters and Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    // Methods
    public void addReservation(Patient patient, Doctor doctor, String reason) {
        // Logic to add a reservation
    }

    public void removeReservation(Patient
