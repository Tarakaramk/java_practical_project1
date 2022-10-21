import mx.tc.j2se.tasks.ArrayTaskList;
import mx.tc.j2se.tasks.Task;

public class Main {
    public static void main(String args[]){
        Task t = new Task("walking",9);
        Task t1 = new Task("Running",7,22,2);
        t1.toString();
        ArrayTaskList<Task> tsk= new ArrayTaskList<Task>();
        tsk.display();
        tsk.add(new Task("walking",9));
    }
}