package library;

public class HardCoverBookFactory implements BookFactory{
    @Override
    public HardCoverBook createBook(String title, String author, int numberOfPages) {
        return new HardCoverBook(title, author, numberOfPages);
    }
}
