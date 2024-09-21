package studentver4;

import java.util.Date;

abstract class Person implements IPerson{
    private String id, fullName;
    private Date dateOfBirht;

    public Person() {}
    public Person(String id, String fullName, Date dateOfBirht) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirht = dateOfBirht;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public Date getDateOfBirht() { return dateOfBirht; }
    public void setDateOfBirht(Date dateOfBirht) { this.dateOfBirht = dateOfBirht; }
    
    @Override
    public abstract void addPerson();
    @Override
    public abstract void updatePerson(String id);
    @Override
    public abstract void displayInfo();
}
