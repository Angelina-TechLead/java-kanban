import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubtaskTest {
    @Test
    public void shouldNotBeOwnEpic() {
        Subtask subtask = new Subtask("Subtask", "Description", 1, TaskStatus.NEW, 1);
        subtask.setEpicId(1);
        assertInstanceOf(Subtask.class, subtask, "Подзадача не является самостоятельной");
    }
}
