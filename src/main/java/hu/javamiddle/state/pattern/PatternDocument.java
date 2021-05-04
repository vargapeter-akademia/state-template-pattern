package hu.javamiddle.state.pattern;

import hu.javamiddle.state.Version;
import lombok.Getter;
import lombok.Setter;

public class PatternDocument {

//    private class DraftDocumentState extends AbstractDocumentState {
//
//        @Override
//        public void setText(String text) {
//           Document.this.text = text;
//        }
//
//    }

    @Getter
    @Setter
    private DocumentState state = new DraftDocumentState(this);

    @Getter
    String text;

    @Getter
    private Version version = new Version(1, 0);

    public void edit() {
        state.edit();
    }

    public void publish() {
        state.publish();
    }

    public void remove() {
        state.remove();
    }

    public void setText(String text) {
        state.setText(text);
    }

    public void archive() {
        state.archive();
    }

    @Override
    public String toString() {
        return "PatternDocument{" +
                "state=" + state +
                ", text='" + text + '\'' +
                ", version=" + version +
                '}';
    }
}
