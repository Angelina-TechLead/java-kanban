import java.util.List;

public class Manager {
    private static Manager historyManager;

    public static TaskManager getDefault() {
        return new InMemoryTaskManager();
    }

    public static HistoryManager getDefaultHistory() {
        return getDefaultHistory ();
    }
    public static List<Task> getHistory() {
        return historyManager.getHistory();
   }

}
