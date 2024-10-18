package healthCare;

import java.util.ArrayList;

/**
 * 
 * @author Edmond
 * @author
 */
public class Doctor extends Staff{
    private ArrayList<Patient> listOfPatient;

     public Doctor(String name, int age){
        super(name, age);
        this.listOfPatient = new ArrayList<>();
     }

    /* #--- Getter and Setters ---# */ 
    
    public String getDoctorName(){
        return this.name;
    }

    public void setDoctorName(String name){
        this.name = name;
    }

    public ArrayList<Patient>  getPatientsList(){
        return this.listOfPatient;
    }

    /* #--- Doctor Methods ---# */

    /** Add a prescription for the patient
     * 
     * @param patient
     * @param medication
     */
     private void prescribeMedication(Patient patient, Medication medication){
          patient.addMedication(medication);
     }

     /** Update the diagnosis of the Patient
      * 
      * @param patient
      */
     private void updateDiagnosis(Patient patient, String diagnosis){
        patient.setSick(diagnosis);
     }
     /** Remove one Patient off the list
      * 
      * @param patient
      * @return message of a patient removed
      */
     private String removePatient(Patient patient){
          listOfPatient.remove(patient);
          return "Removed" + patient;
     }

     /** Add one patient to the list of patient
      * 
      * @param patient
      * @return
      */
     private String admissionOfPatient(Patient patient){
          listOfPatient.add(patient);
          return "Added" + patient;
     }

     @Override
    public String toString(){
        return "Doctor: " + super.toString() + listOfPatient;
    }
	

}
