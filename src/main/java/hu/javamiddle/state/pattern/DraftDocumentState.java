package hu.javamiddle.state.pattern;

public class DraftDocumentState extends AbstractDocumentState {

    public DraftDocumentState(PatternDocument document) {
        super(document);
    }

    @Override
    public void publish() {
        ReviewDocumentState reviewState = new ReviewDocumentState(document);
        document.setState(reviewState);
    }

    @Override
    public void remove() {
        // Törlési logika
    }

    @Override
    public void setText(String text) {
        document.text = text;
    }

    @Override
    public String toString() {
        return "DRAFT";
    }
}
