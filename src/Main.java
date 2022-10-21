import mx.tc.j2se.tasks.ArrayTaskList;
import mx.tc.j2se.tasks.Task;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Task t = new Task("walking",9);
        Task t1 = new Task("Running",7,22,2);
        //t1.toString();
        ArrayTaskList<Task> tsk= new ArrayTaskList<Task>();
        //tsk.display();
        tsk.add(t);
        tsk.add(t1);
        System.out.println(tsk.get(0));
        System.out.println(tsk);
        tsk.display();
    }
}