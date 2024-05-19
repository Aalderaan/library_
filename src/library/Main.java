package library;

public class Main {
    public static void main(String[] args) {
        SoftCoverBookFactory softCoverBookFactory = new SoftCoverBookFactory();
        HardCoverBookFactory hardCoverBookFactory =  new HardCoverBookFactory();

        SoftCoverBook book1 = softCoverBookFactory.createBook("BTitlweqte_Soft", "AName Surname", 514);
        SoftCoverBook book10 = softCoverBookFactory.createBook("AsTitle_Soft", "AName Surname", 5884);
        SoftCoverBook book11 = softCoverBookFactory.createBook("BTiasdtle_Soft", "AName Surname", 587);
        SoftCoverBook book12 = softCoverBookFactory.createBook("BTitle_Soft", "AName Surname", 584);
        HardCoverBook book2 = hardCoverBookFactory.createBook("ATitle_Hard", "BName Surname", 678);
        HardCoverBook book3 = hardCoverBookFactory.createBook("CTitle_Hard", "CName Surname", 678);
        HardCoverBook book4 = hardCoverBookFactory.createBook("ETitle_Hard", "DName Surname", 678);
        HardCoverBook book5 = hardCoverBookFactory.createBook("DTitle_Hard", "EName Surname", 678);
        HardCoverBook book6 = hardCoverBookFactory.createBook("FTitle_Hard", "FName Surname", 678);

        HardCoverBook lordOfRings1 = hardCoverBookFactory.createBook("Lord of the Rings 1", "Tolkin", 678);
        SoftCoverBook lordOfRings2 = softCoverBookFactory.createBook("Lord of the Rings 2", "Tolkin", 594);

        BookGroup lordOfRings = new BookGroup("Lord of the Rings", "Tolkin");
        lordOfRings.addBook(lordOfRings1);
        lordOfRings.addBook(lordOfRings2);

        LibraryFacade library = new LibraryFacade();
        library.addBook(book1);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBookGroup(lordOfRings);

        System.out.println("///////////////////////////");
        System.out.println("books without sorting");
        library.display();

        System.out.println("///////////////////////////");
        System.out.println("Books found by author");

        library.searchByAuthor("AName Surname");
        System.out.println("///////////////////////////");
        System.out.println("Books found by Title");
        library.searchByTitle("A Lord of the Rings");


        System.out.println("///////////////////////////");
        System.out.println("Sorted by author books");

        library.sortByAuthor();
        library.display();

        System.out.println("///////////////////////////");
        System.out.println("Sorted by title books");

        library.sortByTitle();
        library.display();
    }
}