package assignment10;

import java.text.ParseException;

public class Processor {
    public static void main(String[] args) throws ParseException {
        Book book1 = new Book();
        book1.enterBookInfor();
        System.out.println(book1.toString());
    }
}
