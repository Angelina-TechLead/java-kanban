import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EpicTest {
    @Test
    public void shouldBeEqualIfIdsAreSame() {
        Epic epic1 = new Epic("Epic 1", "Description 1", 1, TaskStatus.NEW);
        Epic epic2 = new Epic("Epic 2", "Description 2", 1, TaskStatus.DONE);
        assertEquals(epic1, epic2, "Эпики должны быть одинаковыми.");
    }

    @Test
    public void shouldNotAddSubtaskWithSameId() {
        Epic epic = new Epic("Epic", "Description", 1, TaskStatus.NEW);
        Subtask subtask = new Subtask("Subtask", "Description", 1, TaskStatus.IN_PROGRESS, 1);
        // Проверяем, что добавление подзадачи не вызывает исключение
        assertDoesNotThrow(() -> {
            epic.addSubtask(subtask);
        }, "Эпики не должны быть одинаковыми.");
    }
}
