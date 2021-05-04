package hu.javamiddle.template;

import java.util.Arrays;
import java.util.List;

public class TemplateMain {

    public static void main(String[] args) {
        Book book1 = getBook("Joshue Bloch", "Effective Java", 202302L);
        Book book2 = getBook("Corets, Eva", "Oberon's Legacy", 21302L);

        Library library = new Library();
        library.setName("Library 1");
        library.setBooks(Arrays.asList(book1, book2));

        Library library2 = new Library();
        library2.setName("Library 2");
        library2.setBooks(Arrays.asList(book1, book2));

        JsonReporter jsonReporter = new JsonReporter();
        jsonReporter.generateReport(List.of(library, library2), "json-report");

    }

    private static Book getBook(String s, String s2, long l) {
        Book book1 = new Book();
        book1.setAuthor(s);
        book1.setTitle(s2);
        book1.setId(l);
        return book1;
    }

}
