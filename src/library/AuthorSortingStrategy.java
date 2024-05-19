package library;

import java.util.Comparator;
import java.util.List;

public class AuthorSortingStrategy implements BookSortingStrategy {
    @Override
    public void sort(List<BookComponent> books) {
        books.sort(Comparator.comparing(book -> ((Book) book).getAuthor()));
    }
}
