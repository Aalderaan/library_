package library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements BookComponent, Iterable<BookComponent> {
    private List<BookComponent> books = new ArrayList<>();

    public void addBook(BookComponent book) {
        books.add(book);
    }
    public void sort(BookSortingStrategy strategy) {
        strategy.sort(books);
    }

    public void display() {
        for (BookComponent book : books) {
            book.display();
        }
    }

    public Iterator<BookComponent> iterator() {
        return new BookComponentIterator();
    }

    private class BookComponentIterator implements Iterator<BookComponent> {
        private int position = 0;
        public boolean hasNext() {
            return position < books.size();
        }

        public BookComponent next() {
            if (this.hasNext()) {
                return books.get(position++);
            } else {
                return null;
            }
        }
    }
}
