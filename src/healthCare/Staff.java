package healthCare;
/** Staff of the healthcare system
 * 
 * @author Edmond Li
 * @author
 */
public class Staff {
    protected String name;
    protected int age;
    protected double salary;

    /**
     * 
     * @param name  the name of the staff
     * @param age   the age of the staff
     * @param salary    the amount of money earned
     */
    public Staff(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /** Setter for salary
     * 
     * @param salary the new salary amount
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", " + "Age: " + this.age + ", " + "Salary: " + this.salary;
    }
}
