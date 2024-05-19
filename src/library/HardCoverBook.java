package library;

public class HardCoverBook implements Book{
    private String author;
    private String title;
    private int numberOfPages;

    public HardCoverBook(String title, String author, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Number of pages: " + numberOfPages + ", Type: Hard cover");
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
