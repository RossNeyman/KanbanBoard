import java.util.ArrayList;

public class Task {
    private String taskName;
    private String taskDescription;
    private int taskPriority;
    private int taskStatus;
    private ArrayList<Integer> assignedUserIds = new ArrayList<Integer>();

    public Task(String taskName, String taskDescription, int taskPriority){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.taskStatus = 0;
    }

    //in the future, add a more secure functionality for admins to confirm they have authorization
    public void addAssignedUser(int assignedUserId, int assigningUserRole){
        if(assigningUserRole >= Constants.AUTHORITY_TO_ASSIGN) {
            assignedUserIds.add(assignedUserId);
        }
        return;
    }
    //in the future, check for newStatus being a valid value, possibly with a central file of requirements
    public void setTaskStatus(int newStatus) {taskStatus = newStatus;}
    public void setTaskPriority(int newPriority, int assigningUserRole){
        if(assigningUserRole >= Constants.AUTHORITY_TO_CHANGE_PRIORITY){
            taskPriority = newPriority;
        }
        return;
    }
    public int getTaskPriority(){return taskPriority;}
    public int getTaskStatus(){return taskStatus;}
}
