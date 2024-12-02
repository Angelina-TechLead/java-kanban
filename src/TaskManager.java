import java.util.List;

public interface TaskManager {
    List<Task> getAllTasks();
    List<Epic> getAllEpics();
    List<Subtask> getAllSubtasks();
    void deleteAllTask();
    void deleteAllEpic();
    void deleteAllSubtask();
    Task getTask(int id);
    Task getEpic(int id);
    Task getSubtasks(int id);
    void addTask(Task task);
    void addEpic(Epic epic);
    void addSubtask(Subtask subtask);
    void updateTask(Task task);
    void updateEpic(Epic epic);
    void updateSubtask(Subtask subtask);
    void deleteTask(int id);
    void deleteEpic(int id);
    void deleteSubtasks(int id);
    List<Subtask> getSubtasksOfEpic(int epicId);
    List<Task> getHistory();
}
