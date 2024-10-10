package assignment13;

import java.util.Date;

public abstract class EMPLOYEE implements IEMPLOYEE{
    private String emId, emName;
    private Date emDateOfBirth, startDate;

    public String getEmId() {
        return emId;
    }

    public void setEmId(String emId) {
        this.emId = emId;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public Date getEmDateOfBirth() {
        return emDateOfBirth;
    }

    public void setEmDateOfBirth(Date emDateOfBirth) {
        this.emDateOfBirth = emDateOfBirth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public abstract void input();
    public abstract void output();
    public abstract int calculateSeniority();
}
