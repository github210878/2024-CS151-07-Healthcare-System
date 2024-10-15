package healthCare;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private ArrayList<Medication> prescription;
    private double fees;
    private String sick;
    private boolean refillNoti;
    private ArrayList<Doctor> doctorList;

    public Patient(String name, int age, String sick){
        this.name = name;
        this.age = age;
        this.sick = sick;
        this.fees = 0.00;
        this.refillNoti = false;
        prescription = new ArrayList<Medication>();
        doctorList = new ArrayList<Doctor>();
    }

    /**
     * 
     * @param doctor
     */
    public void reserveAppointment(Doctor doctor){
        this.doctorList.add(doctor);
    }

    /**
     * 
     * @param medication
     */
    public void requestMedication(Medication medication){
        this.prescription.add(medication);
    }

    /**
     * 
     * @param orginalDoctor
     * @param newDoctor
     */
    public void changeDoctor(Doctor orginalDoctor, Doctor newDoctor){
        for (int i = 0; i < doctorList.size(); i++){
            if (doctorList.get(i) == orginalDoctor){
                doctorList.set(i, newDoctor);
            }
        }
    }

    /**
     * 
     * @param medication
     */
    public void refillNoti(Medication medication){
        medication.refillNotification();
        if (this.refillNoti == false) {
            this.refillNoti = true;
        }
        else {
            this.refillNoti = false;
        }
    }

    /**
     * 
     */
    public void cancelReservation(){

    }
}
