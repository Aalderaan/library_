package library;

public class LibraryFacade implements BookComponent{
    private BookCollection collection = new BookCollection();

    public void addBook(Book book) {
        collection.addBook(book);
    }

    public void addBookGroup(BookGroup group) {
        collection.addBook(group);
    }

    public void sortByAuthor() {
        collection.sort(new AuthorSortingStrategy());
    }

    public void sortByTitle() {
        collection.sort(new TitleSortingStrategy());
    }

    @Override
    public void display() {
        collection.display();
    }

    public void searchByTitle(String title) {
        BookCollection result = new BookCollection();
        for (BookComponent book : collection) {
            if (book instanceof Book && ((Book) book).getTitle().equalsIgnoreCase(title)) {
                result.addBook(book);
            } else if (book instanceof BookGroup && ((BookGroup) book).getTitle().equalsIgnoreCase(title)) {
                result.addBook(book);
            }
        }
        result.display();
    }

    public void searchByAuthor(String author) {
        BookCollection result = new BookCollection();
        for (BookComponent book : collection) {
            if (book instanceof Book && ((Book) book).getAuthor().equalsIgnoreCase(author)) {
                result.addBook(book);
            } else if (book instanceof BookGroup) {
                BookGroup group = (BookGroup) book;
                for (BookComponent nestedBook : group.getBooks()) {
                    if (nestedBook instanceof Book && ((Book) nestedBook).getAuthor().equalsIgnoreCase(author)) {
                        result.addBook(nestedBook);
                    }
                }
            }
        }
        result.display();
    }
}
