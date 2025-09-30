
public abstract class MainEmailHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String text) {
        for (String key : keys()) {
            if (text.toLowerCase().contains(key.toLowerCase())) {
                process(text);
                return;
            }
        }
        if (next != null) {
            next.handle(text);
        } else {
            new OfficeHandler().process(text); // fallback
        }
    }

    protected abstract String[] keys();
    protected abstract void process(String text);
}