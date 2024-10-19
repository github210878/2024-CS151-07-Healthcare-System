package healthCare;

/**
 * 
 * @author Edmond Li
 * @author
 */
public class Medication implements refillNotification{

private String name;
private int dosageAmount;
private int refill;
private int stockAmount;

public Medication(String name, int dosage, int refill, int stockAmount){
    this.name = name;
    this.dosageAmount = dosage;
    this.refill = refill;
    this.stockAmount = stockAmount;
}

/* #--- Getter and Setters ---# */ 

/** Getter for the stock amount
 * 
 * @return the amount of medication that is left stock
 */
public int getStockAmount(){
    return this.stockAmount;
}

public void setStockAmount(int stock){
    this.stockAmount = stock;
}

public String getMedicationName(){
    return this.name;
}

/* #--- Medication Methods ---# */

/** Change the dosage amount to new one
 * 
 * @param amount the new dosage amount
 */
public void changeDosage(int amount){
    this.dosageAmount = amount;
}

/** Check if a Medication is below a certain threshold
 * 
 * @param threshold the minimal amount of medication
 * @return
 */
public boolean isLowOnStock(int threshold) {
    return this.stockAmount < threshold;
}

/** Add refill amount 
 * 
 * @param amount the amount of refill that need to be added
 * @return refill add message
 */
private String addRefill(int amount){
    this.refill += amount;
    return amount + " refill added";
}

/** Give a patient a refill
 * 
 * @return The amount of refill available 
 */
public String requestRefill(Patient patient, int amount) {
    if (this.stockAmount - amount > 0) {
        stockAmount -= amount;
        this.addRefill(amount);
        return "Refill requested for " + patient.getName() + ", " + this.stockAmount + "left.";
    } else {
        return "No refills available for " + this.name + ".";
    }
}

/** 
 * 
 */
@Override
public String refillNoti(){
    if (this.refill > 0) {
        this.refill -= 1;
        return "Thank you for picking up your refill! We will notify you for the next refill.";
    } else {
        return "Sorry, no more refills available for " + this.name + ".";
    }
}

/** 
 * 
 * @return the medication information 
 */
public String medicationInfo(){
    String info = this.name + ": " + "stock amount - " + this.stockAmount + " , dosage amount - " + this.dosageAmount 
    + " , refill amount" + this.refill;
    return info;
}

}
