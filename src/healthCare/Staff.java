package healthCare;
/** Staff of the healthcare system
 * 
 * @author Edmond Li
 * @author
 */
public class Staff {
    protected String name;
    protected int age;

    /**
     * 
     * @param name  the name of the staff
     * @param age   the age of the staff
     */
    public Staff(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Staff() {
        this.name = "";
        this.age = 0;
        // Default constructor
    }

    /* #--- Getter and Setters ---# */

    /** Name getter
     * 
     * @return staff name
     */
    public String getName(){
        return this.name;
    }

    /** Name setter
     * 
     * @param name the new name
     */
    public void setName(String name){
        this.name = name;
    }

    /** Age getter
     * 
     * @return age of staff
     */
    public int getAge(){
        return this.age;
    }

    /** Age setter
     * 
     * @param age new age of staff
     */
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", " + "Age: " + this.age;
    }
}
