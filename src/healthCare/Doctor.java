package healthCare;

import java.util.ArrayList;

/**
 * 
 * @author Edmond
 * @author
 */
public class Doctor extends Staff{
    private ArrayList<Patient> listOfPatient;

     public Doctor(String name, int age, double salary){
        super(name, age, salary);
        this.listOfPatient = new ArrayList<>();
     }

    public String getName(){
        return this.name;
    }

    /**
     * 
     * @param patient
     * @param medication
     */
     private void prescribeMedication(Patient patient, Medication medication){
          
     }

     /**
      * 
      * @param doctor
      */
     private void referral(Doctor doctor){

     }
    /**
     * 
     * @param patient
     */
     private void updateDiagnosis(Patient patient){

     }
     /**
      * 
      * @param patient
      * @return
      */
     private String removePatient(Patient patient){
          listOfPatient.remove(patient);
          return "Removed" + patient;
     }

     /**
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
