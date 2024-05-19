package library;

import java.util.ArrayList;
import java.util.List;

public class BookGroup implements Book{
    private String title;
    private String author;
    private int numberOfPages;
    private List<Book> books = new ArrayList<>();


    public List<Book> getBooks() {
        return books;
    }
    public BookGroup(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getNumberOfPages() {
        books.stream().forEach(i -> numberOfPages += i.getNumberOfPages());
        return numberOfPages;
    }

    @Override
    public void display() {
        System.out.println("Library. Book Group: " + title);
        for (Book book : books) {
            book.display();
        }
        System.out.println("Total number of pages: " + getNumberOfPages());
    }
}
