package hu.javamiddle.template;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@Data
@XmlType(name = "book")
public class Book {

    @XmlAttribute
    private long id;

    @XmlElement
    private String author;

    @XmlElement
    private String title;

}
