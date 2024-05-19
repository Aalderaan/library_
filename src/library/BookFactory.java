package library;

public interface BookFactory {
    Book createBook(String title, String author, int numberOfPages);
}
