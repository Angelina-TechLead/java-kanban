import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class InMemoryTaskManagerTest {
    private TaskManager taskManager;

    @BeforeEach
    public void setUp() {
        taskManager = new InMemoryTaskManager();
    }

    @Test
    public void shouldAddAndRetrieveDifferentTasks() {
        Task task = new Task("Task", "Description", 1, TaskStatus.NEW);
        Epic epic = new Epic("Epic", "Description", 2, TaskStatus.NEW);
        Subtask subtask = new Subtask("Subtask", "Description", 3, TaskStatus.NEW, 2);

        taskManager.addTask(task);
        taskManager.addEpic(epic);
        taskManager.addSubtask(subtask);

        assertEquals(task, taskManager.getTask(1));
        assertEquals(epic, taskManager.getEpic(2));
        assertEquals(subtask, taskManager.getSubtasks(3));
    }

    @Test
    public void shouldMaintainTaskHistory() {
        Task task = new Task("Task", "Description", 1, TaskStatus.NEW);
        taskManager.addTask(task);

        taskManager.getTask(1);
        List<Task> history = taskManager.getHistory();

        assertEquals(1, history.size());
        assertEquals(task, history.get(0));
    }

    @Test
    public void shouldNotModifyTaskOnAddition() {
        Task task = new Task("Task", "Description", 1, TaskStatus.NEW);
        Task originalTask = new Task("Task", "Description", 1, TaskStatus.NEW);
        taskManager.addTask(task);
        assertEquals(originalTask, task, "Неизменяется задача");
    }

    @Test
    public void shouldNotConflictGeneratedAndAssignedIds() {
        Task task1 = new Task("Task 1", "Description 1", 1, TaskStatus.NEW);
        Task task2 = new Task("Task 2", "Description 2", 2, TaskStatus.NEW);
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        assertEquals(task1, taskManager.getTask(1));
        assertEquals(task2, taskManager.getTask(2));
    }
}
