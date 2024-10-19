package healthCare;

import java.sql.Date;
import java.util.ArrayList;
import java.time.LocalDate;

public class Patient implements refillNotification{
    private String name;
    private int age;
    private ArrayList<Medication> prescription;
    private String sick;
    private boolean refillNotification;
    private Doctor doctor;
    private ArrayList<Reservation> reservationList;

    public Patient(String name, int age, String sick, Doctor doctor){
        this.name = name;
        this.age = age;
        this.sick = sick;
        this.refillNotification = false;
        this.doctor = doctor;
        prescription = new ArrayList<Medication>();
        reservationList = new ArrayList<Reservation>();
    }

    /* #--- Getter and Setters ---# */ 

    public String getName(){
        return this.name;
    }

    public ArrayList<Medication> getPatientPrescription(){
        return this.prescription;
    }

    public ArrayList<Reservation> getPatientReservations(){
        return this.reservationList;
    }

    public String getSick(){
        return this.sick;

    }

    public void setSick(String sickness){
        this.sick = sickness;
    }

    public boolean getRefillNotification(){
        return this.refillNotification;
    }

    /* #--- Patient Methods ---# */

    /** Add a reservation to the list
     * 
     * @param 
     */
    public void reserveAppointment(int year, int month, int day, String reason){
        LocalDate reservedDate = LocalDate.of(year, month, day);
        Reservation reservation = new Reservation(reservedDate, this, reason, doctor);
        this.reservationList.add(reservation);

    }

    /** Remove a reservation from the list
     * 
     */
    public void cancelReservation(Reservation reservation){
        for (int i = 0; i < reservationList.size(); i++){
            if (reservationList.get(i).equals(reservation) == true){
                reservationList.remove(i);
            }
        }
    }

    /** Add a medication to the prescription list
     * 
     * @param medication
     */
    public void addMedication(Medication medication){
        this.prescription.add(medication);
    }
    
    /**
     * 
     * @param medication
     */
    public void removeMedication(Medication medication){
        for (int i = 0; i < prescription.size(); i++){
            if (prescription.get(i).equals(medication) == true){
                prescription.remove(i);
            }
        }
    }

    @Override
    public String refillNoti(){
        if (refillNotification) {
            refillNotification = false;
            return "Notification has been turned off";
        } else {
            refillNotification = true;
            return "We will notify you for your next refill";
        }
    }

    public String viewProfile(){
        String profile = this.name + ": age " + this.age + ", sickness: " + this.sick + ", Doctor: " + this.doctor
        + ", refill noification: " + this.refillNotification;
        return profile;
    }

}
