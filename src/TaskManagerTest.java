import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    @Test
    public void shouldReturnInitializedTaskManager() {
        TaskManager taskManager = new InMemoryTaskManager();
        assertNotNull(taskManager, "TaskManager should be initialized and not null.");
        assertInstanceOf(InMemoryTaskManager.class, taskManager, "TaskManager should be an instance of InMemoryTaskManager.");
    }
}
