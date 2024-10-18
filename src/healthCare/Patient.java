package healthCare;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private ArrayList<Medication> prescription;
    private String sick;
    private boolean refillNoti;
    private Doctor doctor;
    private ArrayList<Reservation> reservationList;

    public Patient(String name, int age, String sick, Doctor doctor){
        this.name = name;
        this.age = age;
        this.sick = sick;
        this.refillNoti = false;
        this.doctor = doctor;
        prescription = new ArrayList<Medication>();
        reservationList = new ArrayList<Reservation>();
    }

    /* #--- Getter and Setters ---# */ 

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

    /* #--- Patient Methods ---# */

    /** Add a reservation to the list
     * 
     * @param doctor
     */
    public void reserveAppointment(Doctor doctor){
        
    }

    /** Remove a reservation from the list
     * 
     */
    public void cancelReservation(){

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

    /**
     * 
     * @param medication
     */
    public void refillNoti(Medication medication){

    }

    public String viewProfile(){
        String profile = this.name + ": age " + this.age + ", sickness: " + this.sick + ", Doctor: " + this.doctor
        + ", refill noification: " + this.refillNoti;
        return profile;
    }

}
