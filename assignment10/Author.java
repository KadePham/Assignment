package assignment10;

import java.text.*;
import java.util.*;

public class Author {
    private String authorID, name;
    private Date dateOfBirth;
    
    public Author (String authorID, String name, Date dateOfBirth) {
        this.authorID = authorID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public Author () {}
    
    public void enterAuthorInfor () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAuthor ID: "); this.authorID = scanner.nextLine();
        System.out.print("Name: "); this.name = scanner.nextLine();
        String dateOfBirthString;
        System.out.print("Date of birth: "); dateOfBirthString = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = formatter.parse(dateOfBirthString);
        
//        return new Author(author.authorID, author.name, author.dateOfBirth);
    }
    public String getAuthorID () {
        return this.authorID;
    }
    public  void setAuthorID (String authorID) {
        this.authorID = authorID;
    }
    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public Date getDateOfBirth () {
        return this.dateOfBirth;
    }
    public void setDateOfBirth (Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString () {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return "authorID = " + this.authorID + ", name = " + this.name
                + ", dateOfBirth = " + formatter.format(this.dateOfBirth);
    }
}