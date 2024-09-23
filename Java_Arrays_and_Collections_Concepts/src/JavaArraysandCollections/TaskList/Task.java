package JavaArraysandCollections.TaskList;

public class Task {
    private String taskName;
    private String dueDate;
    private String priority;
    private boolean isCompleted;

    public Task(String taskName, String dueDate, String priority) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isCompleted = false; // Default status is not completed
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return "[" + priority + "] " + taskName + " - Due: " + dueDate + 
               " - " + (isCompleted ? "Completed" : "Not Completed");
    }
}
