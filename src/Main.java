public class Main {
    public static void main(String[] args) {
        TaskManager manager = new InMemoryTaskManager();

        Task task1 = new Task("Task 1", "Description 1", TaskStatus.NEW);
        Task task2 = new Task("Task 2", "Description 2", TaskStatus.NEW);

        manager.addTask(task1);
        manager.addTask(task2);

        Epic epic1 = new Epic("Epic 1", "Description Epic 1", 0, TaskStatus.NEW);
        Subtask subtask1 = new Subtask("Subtask 1", "Description Subtask 1", 0, TaskStatus.NEW, epic1.getId());
        Subtask subtask2 = new Subtask("Subtask 2", "Description Subtask 2", 0, TaskStatus.NEW, epic1.getId());

        manager.addEpic(epic1);
        manager.addSubtask(subtask1);
        manager.addSubtask(subtask2);

        System.out.println("All tasks: " + manager.getAllTasks());
        System.out.println("All epics: " + manager.getAllEpics());
        System.out.println("All subtasks: " + manager.getAllSubtasks());

        // Update statuses
        task1.setStatus(TaskStatus.IN_PROGRESS);
        manager.updateTask(task1);

        subtask1.setStatus(TaskStatus.DONE);
        manager.updateSubtask(subtask1);

        System.out.println("Updated tasks: " + manager.getAllTasks());
        System.out.println("Updated epics: " + manager.getAllEpics());
        System.out.println("Updated subtasks: " + manager.getAllSubtasks());

        manager.deleteTask(task2.getId());
        manager.deleteEpic(epic1.getId());

        System.out.println("Tasks after deletion: " + manager.getAllTasks());
        System.out.println("Epics after deletion: " + manager.getAllEpics());
        System.out.println("Subtasks after deletion: " + manager.getAllSubtasks());
    }
}
