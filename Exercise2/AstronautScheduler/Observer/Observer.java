
package Observer;

import Singleton.Task;

public interface Observer {
    void notifyConflict(Task existingTask);
}
