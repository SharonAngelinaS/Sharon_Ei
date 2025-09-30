

public class AcademicHandler extends MainEmailHandler {
    @Override
    protected String[] keys() {
        return new String[] {"academic", "exam", "syllabus", "results"};
    }

    @Override
    protected void process(String text) {
        System.out.println("Academic Team handled: " + text);
    }
}