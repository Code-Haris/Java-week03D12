package Library;

import java.util.ArrayList;
import java.util.HashMap;


public class Start {
    public static void main(String[] args) {

        User usr1 = new User("Philip", "philip@mail.com");
        User usr2 = new User("Wojceck", "wojceck@mail.com");
        User usr3 = new User("John", "john@mail.com");

        HashMap<String, User> users = new HashMap<>();
        users.put("u1", usr1);
        users.put("u2", usr2);
        users.put("u3", usr3);

        Book book1 = new Book ("Harry Potter I", "J.K. Rowling", "Blooming",Book.Status.Available);
        Book book2 = new Book ("Hansel und Gretel", "Gebrüder Grimm", "Keine Ahnung",Book.Status.Available);
        Book book3 = new Book ("Harry III", "J.k. Rowling", "Blooming",Book.Status.Available);
        Book book4 = new Book ("Harry Potter IV", "JK Rowling","Bloomings", Book.Status.notAvailable);

        HashMap <String, Book> books = new HashMap<>();
        books.put("b1",book1);
        books.put("b2",book2);
        books.put("b3",book3);

        ArrayList<String> bookLib = new ArrayList<>();
        bookLib.add("b1");
        bookLib.add("b2");

        ArrayList<String> bookLib2 = new ArrayList<>();
        bookLib2.add("b3");

        Library lib1 = new Library(bookLib);
        Library lib2 = new Library(bookLib2);

        HashMap<String, Library> libs = new HashMap<>();
        libs.put("l1", lib1);
        libs.put("l2", lib2);

        rentABook(books.get("b1"), users.get("u1"), libs.get("l1"));
        returnABook(books.get("b1"), users.get("u1"), libs.get("l1"));

    }

    public static void rentABook(Book bookId, User userID, Library libID){
        bookId.rentingBook();
        userID.setUsrBooks(bookId);
        libID.rentBook(bookId);
    }
    public static void returnABook(Book bookId, User userID, Library libID){

    }
}