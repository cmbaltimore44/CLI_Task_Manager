import java.time.LocalDateTime;

public class task implements Comparable<task> {

    /*
     * Private instance variables for an individual task --
     * id: A unique identifier for the task
     * description: A short description of the task
     * status: The status of the task (todo, in-progress, done)
     * createdAt: The date and time when the task was created
     * updatedAt: The date and time when the task was last updated
     */
    private int id;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    // default constructor
    public task() {
        id = 0;
        description = "Default Task";
        status = "todo";
        createdAt = "" + LocalDateTime.now();
        updatedAt = "" + LocalDateTime.now();
    }

    // user input constructor
    public task(int i, String d, String s) {
        id = i;
        description = d;
        status = s;
        createdAt = "" + LocalDateTime.now();
        updatedAt = "" + LocalDateTime.now();
    }

    /*
     * Method to update a task
     * 
     * @param: a string representing the new description and a string representing
     * the new status
     * 
     * @return: void
     */
    public void updateTask(String desc, String stat) {
        description = desc;
        status = stat;
        updatedAt = "" + LocalDateTime.now();
    }

    /*
     * compareTo which uses a tasks ID to compare against another task
     * 
     * @return: 1 if ID's are equal or this.ID is greater, 0 otherwise
     */
    public int compareTo(task other) {
        if (this.id == other.id)
            return 1;
        return this.id > other.id ? 1 : 0;
    }

}
