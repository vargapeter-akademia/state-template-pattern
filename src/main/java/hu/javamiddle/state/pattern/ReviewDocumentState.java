package hu.javamiddle.state.pattern;

public class ReviewDocumentState extends AbstractDocumentState {

    public ReviewDocumentState(PatternDocument document) {
        super(document);
    }

    @Override
    public void edit() {
        DraftDocumentState draftState = new DraftDocumentState(document);
        document.setState(draftState);

        document.getVersion().nextMinor();
    }

    @Override
    public void publish() {
        PublishedDocumentState publishedState = new PublishedDocumentState(document);
        document.setState(publishedState);
    }

    @Override
    public String toString() {
        return "REVIEW";
    }
}
