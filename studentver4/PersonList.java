package studentver4;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> personList = new ArrayList<>();

    public PersonList() {}
    public PersonList (ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() { return personList; }
    public void setPersonList(ArrayList<Person> personList) { this.personList = personList; }
    
    public void addStudent() {
        Person student = new Student();
        student.addPerson();
        personList.add(student);
    }
    public void addTeacher() {
        Person teacher = new Teacher();
        teacher.addPerson();
        personList.add(teacher);
    }
    public void updatePerson (String id) {
        for (Person i : personList) {
            if (id.equalsIgnoreCase(i.getId()) && (i instanceof Student))
                i.updatePerson(id);
            else if (id.equalsIgnoreCase(i.getId()) && (i instanceof Teacher))
                i.updatePerson(id);
        }
    }
    public void deletePersonById (String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (id.equalsIgnoreCase(personList.get(i).getId()))
                personList.remove(i);
        }
    }
    public Person findPersonById (String id) {
        for (Person i : personList) {
            if (id.equalsIgnoreCase(i.getId()))
                return i;
        }
        return null;
    }
    public void displayEveryone() {
        for (Person i : personList) {
            i.displayInfo();
        }
    }
    public Student findTopStudent() {
        Person topStudent = new Student();
        for (Person i : personList) {
            if (i instanceof Student)
                topStudent = i;
        }
        for (Person i : personList) {
            if (i instanceof Student)
                if (((Student) topStudent).getGpa() < ((Student) i).getGpa())
                    topStudent = i;
        }
        return (Student) topStudent;
    }
    public Teacher findTeacherByDepartment(String department) {
        for (Person i : personList) {
            if (i instanceof Teacher)
                if(department.equalsIgnoreCase(((Teacher) i).getDepartment()))
                    return (Teacher) i;
        }
        return null;
    }
}
