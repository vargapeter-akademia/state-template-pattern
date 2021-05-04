package hu.javamiddle.state.pattern;

public interface DocumentState {

    void edit();
    void publish();
    void remove();
    void archive();

    void setText(String text);

}
