package hu.javamiddle.state;

import hu.javamiddle.state.pattern.PatternDocument;
import hu.javamiddle.state.pre.PreDocument;

public class DocumentMain {

    public static void main(String[] args) {
        PreDocument document = new PreDocument();
        System.out.println(document);

        document.publish();
        System.out.println(document);

        document.edit();
        System.out.println(document);

        document.publish();
        System.out.println(document);

        document.publish();
        System.out.println(document);

        document.edit();
        System.out.println(document);

        PatternDocument patternDocument = new PatternDocument();
        System.out.println(patternDocument);

        patternDocument.publish();
        System.out.println(patternDocument);

        patternDocument.edit();
        System.out.println(patternDocument);

        patternDocument.publish();
        System.out.println(patternDocument);

        patternDocument.publish();
        System.out.println(patternDocument);

        patternDocument.edit();
        System.out.println(patternDocument);
    }

}
