import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartHistory {
    private List<String> history = Collections.synchronizedList(new ArrayList<>());
    private static CartHistory instance = new CartHistory();

    // private constructor -> Singleton
    private CartHistory() {}

    public static CartHistory getInstance() {
        return instance;
    }

    public void addAction(String action) {
        history.add(action);
        System.out.println("Action recorded: " + action);
    }

    public String undoAction() {
        if (history.isEmpty()) {
            return "No actions to undo!";
        }
        return "Undoing: " + history.remove(history.size() - 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cart History:\n");
        for (String h : history) {
            sb.append(" - ").append(h).append("\n");
        }
        return sb.toString();
    }
}
