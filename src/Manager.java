import java.util.List;

public class Manager {
    private static Manager historyManager;

    public static TaskManager getDefault() {
        return new InMemoryTaskManager();
    }

    public static HistoryManager getDefaultHistory(int i) {
        return getDefaultHistory (10);
    }
    public static List<Task> getHistory() {
        return historyManager.getHistory();
   }

}
