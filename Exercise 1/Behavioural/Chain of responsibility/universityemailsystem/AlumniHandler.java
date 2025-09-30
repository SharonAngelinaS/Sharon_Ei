public class AlumniHandler extends MainEmailHandler {
    @Override
    protected String[] keys() {
        return new String[] {"alumni", "reunion", "transcript"};
    }

    @Override
    protected void process(String text) {
        System.out.println("Alumni Team handled: " + text);
    }
}