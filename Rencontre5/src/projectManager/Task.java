package projectManager;

public class Task {
    private String description;
    private Status status = Status.NOT_STARTED;
    private int duration;
    private int priority;

    public Task(){
        description = "";
        duration = 0;
        priority = -1;
    }

    public Task(String description, Status status, int duration, int priority) {
        this.description = description;
        this.status = status;
        this.duration = duration;
        this.priority = priority;
    }


    @Override
    public String toString() {
        return  "Descriptionj :\t" + description +
                "\nStatus : \t" + status +
                "\nDuration : \t" + duration +
                "\nPriority : \t" + priority;
    }
}
