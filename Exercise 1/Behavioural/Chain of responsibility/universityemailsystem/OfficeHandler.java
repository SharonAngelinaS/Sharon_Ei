

public class OfficeHandler extends MainEmailHandler {
    @Override
    protected String[] keys() {
        return new String[] {"office", "administration", "certificate", "fees"};
    }

    @Override
    protected void process(String text) {
        System.out.println("Office Team handled: " + text);
    }
}