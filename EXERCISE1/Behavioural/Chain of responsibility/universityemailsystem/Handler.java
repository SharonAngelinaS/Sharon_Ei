

public interface Handler {
    void setNext(Handler next);
    void handle(String text);
}