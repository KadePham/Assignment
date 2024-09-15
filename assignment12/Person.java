package assignment12;

import java.util.*;

public abstract class Person implements IPerson{
    private String id, fullName;
    private Date dateOfBirth = new Date();

    public Person() {}
    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public abstract void displayInfo();
}
