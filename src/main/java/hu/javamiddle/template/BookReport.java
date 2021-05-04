package hu.javamiddle.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookReport {

    private Long id; // Book.id
    private String library; // Library.name
    private String name; // Book.author: Book.title

}
