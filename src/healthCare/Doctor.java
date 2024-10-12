package healthCare;

import java.util.ArrayList;

/**
 * 
 * @author Edmond
 */
public class Doctor extends Staff{
    private ArrayList<Patient> listOfPatient;

     public Doctor(String name, int age, double salary){
        super(name, age, salary);
        this.listOfPatient = new ArrayList<>();
     }

     private void prescribeMedication(Medication medication){
          
     }
     private void referral(Doctor doctor){

     }
     private void updateDiagnosis(Patient patient){

     }
     private String removePatient(Patient patient){
          listOfPatient.remove(patient);
          return "Removed" + patient;
     }
     private String admissionOfPatient(Patient patient){
          listOfPatient.add(patient);
          return "Added" + patient;
     }

     @Override
    public String toString(){
        return "Doctor: " + super.toString() + listOfPatient;
    }

}
