package hu.javamiddle.state.pattern;

public class PublishedDocumentState extends AbstractDocumentState{

    protected PublishedDocumentState(PatternDocument document) {
        super(document);
    }

    @Override
    public void edit() {
        DraftDocumentState draftState = new DraftDocumentState(document);
        document.setState(draftState);

        document.getVersion().nextMajor();
    }

    @Override
    public void remove() {
        // Törlési logika
    }

    @Override
    public void archive() {
        ArchivedDocumentState archiveState = new ArchivedDocumentState(document);
        document.setState(archiveState);
    }

    @Override
    public String toString() {
        return "PUBLISHED";
    }
}
