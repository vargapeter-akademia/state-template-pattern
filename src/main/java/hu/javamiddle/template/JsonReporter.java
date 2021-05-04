package hu.javamiddle.template;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;

import javax.swing.*;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class JsonReporter {

    @SneakyThrows
    public void generateReport(List<Library> libraries, String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        // TODO validation

        List<BookReport> reports = libraries.stream()
                .map(library ->
                        library.getBooks().stream()
                                .map(e -> new BookReport(e.getId(), library.getName(), e.getAuthor() + ":" + e.getTitle()))
                                .collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        OutputStream out = Files.newOutputStream(Paths.get(fileName + ".json"));

        objectMapper.writeValue(out, reports);
    }

}
