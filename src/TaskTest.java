import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void shouldBeEqualIfIdsAreSame() {
        Task task1 = new Task("Task 1", "Description 1", TaskStatus.NEW);
        Task task2 = new Task("Task 2", "Description 2", TaskStatus.DONE);
        assertEquals(task1, task2, "ID одинаковые");
    }

    @Test
    public void shouldNotBeEqualIfIdsAreDifferent() {
        Task task1 = new Task("Task 1", "Description 1", TaskStatus.NEW);
        Task task2 = new Task("Task 2", "Description 2", TaskStatus.DONE);
        assertNotEquals(task1, task2, "ID неодинаковые.");
    }
}
