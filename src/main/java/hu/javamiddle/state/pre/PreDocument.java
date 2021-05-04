package hu.javamiddle.state.pre;

import hu.javamiddle.state.IllegalStateTranstionException;
import hu.javamiddle.state.Version;
import lombok.Getter;

public class PreDocument {

    private static final String DRAFT = "DRAFT";
    private static final String REVIEW = "REVIEW";
    private static final String PUBLISHED = "PUBLISHED";

    @Getter
    private String text;
    private Version version = new Version(1, 0);

    private String state = DRAFT;

    public void edit() {
        switch (state) {
            case DRAFT:
                throw new IllegalStateTranstionException();
            case REVIEW:
                version.nextMinor();
                state = DRAFT;
                break;
            case PUBLISHED:
                version.nextMajor();
                state = DRAFT;
                break;
        }
    }

    public void publish() {
        switch (state) {
            case DRAFT:
                state = REVIEW;
                break;
            case REVIEW:
                state = PUBLISHED;
                break;
            case PUBLISHED:
                throw new IllegalStateTranstionException();
        }
    }

    public void remove() {
        switch (state) {
            case PUBLISHED:
            case DRAFT:
                // Törlés logikája
                break;
            case REVIEW:
                throw new IllegalStateTranstionException();
        }
    }

    public void setText(String text) {
        if (state.equals(DRAFT)) {
            this.text = text;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                ", version=" + version +
                ", state='" + state + '\'' +
                '}';
    }
}
