package library;

public class SoftCoverBook implements Book {
    private String title;
    private String author;
    private int numberOfPages;

    public SoftCoverBook(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Number of pages: " + numberOfPages + ", Type: Soft cover");
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
        return numberOfPages;
    }
}
