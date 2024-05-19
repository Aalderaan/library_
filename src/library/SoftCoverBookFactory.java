package library;

public class SoftCoverBookFactory implements BookFactory {
    @Override
    public SoftCoverBook createBook(String title, String author, int numberOfPages) {
        return new SoftCoverBook(title, author, numberOfPages);
    }
}
