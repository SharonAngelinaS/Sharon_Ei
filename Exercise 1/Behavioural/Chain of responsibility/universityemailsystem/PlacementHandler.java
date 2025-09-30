

public class PlacementHandler extends MainEmailHandler {
    @Override
    protected String[] keys() {
        return new String[] {"placement", "internship", "job", "career"};
    }

    @Override
    protected void process(String text) {
        System.out.println("Placement Team handled: " + text);
    }
}