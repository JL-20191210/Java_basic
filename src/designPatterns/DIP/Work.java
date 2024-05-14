package designPatterns.DIP;

/**
 * @author felix
 * @date 2024/5/10 14:28
 */
public class Work {
    private Task task;

    public Work(Task task){
        this.task = task;
    }

    public void performTask(){
        task.execute();
    }
}
