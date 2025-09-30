import java.util.ArrayList;
import java.util.List;

public class Forum implements Subject {
    private List<String> unreadMessages;
    private List<Observer> observers;

    public Forum() {
        unreadMessages = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void postMessage(String message) {
        unreadMessages.add(message);
        notifyObservers(message);
    }

    public void markAllRead() {
        unreadMessages.clear();
        notifyObservers(null);
    }

    public List<String> getUnreadMessages() {
        return unreadMessages;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}