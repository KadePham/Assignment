package assignment10;

import java.text.ParseException;
import java.util.*;

public class Book {
    private String bookID, title;
    private Author author = new Author();
    
    public Book () {}
    public Book (String bookID, String title, Author author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }
    
    public void enterBookInfor () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nBook ID: "); this.bookID = scanner.nextLine();
        System.out.print("Title: "); this.title = scanner.nextLine();
        System.out.print("|Author information|"); this.author.enterAuthorInfor();
    }
    public String getBookID () {
        return this.bookID;
    }
    public void setBookID (String bookID) {
        this.bookID = bookID;
    }
    public String getTitle () {
        return this.title;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public Author getAuthor () {
        return this.author;
    }
    public void setAuthor (Author author) {
        this.author = author;
    }
    
    @Override
    public String toString () {
        return "Book{" + " bookID = " + this.bookID
                + ", title = " + this.title + ", " + this.author.toString() + " }";
    }
}