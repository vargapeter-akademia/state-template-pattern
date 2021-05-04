package hu.javamiddle.state.pattern;

import hu.javamiddle.state.IllegalStateTranstionException;

public abstract class AbstractDocumentState implements DocumentState {

    protected final PatternDocument document;

    protected AbstractDocumentState(PatternDocument document) {
        this.document = document;
    }

    @Override
    public void edit() {
        throw new IllegalStateTranstionException();
    }

    @Override
    public void publish() {
        throw new IllegalStateTranstionException();
    }

    @Override
    public void remove() {
        throw new IllegalStateTranstionException();
    }

    @Override
    public void archive() {
        throw new IllegalStateTranstionException();
    }

    @Override
    public void setText(String text) {
        throw new IllegalStateException();
    }

}
