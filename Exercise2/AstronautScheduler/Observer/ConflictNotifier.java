
package Observer;

import Singleton.Task;

public class ConflictNotifier implements Observer {
    @Override
    public void notifyConflict(Task existingTask) {
        System.out.println("Error: Task conflicts with existing task  "+existingTask );
    }
}
