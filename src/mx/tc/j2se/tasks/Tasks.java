package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.util.Iterator;

public class Tasks {
    Iterator<Task> incoming(Iterator<Task> tasks, LocalDateTime start, LocalDateTime end){

        ArrayTaskList a = new ArrayTaskList();
        TaskListFactory ts= new TaskListFactory();
        AbstractTaskList ab =ts.createTaskList(ListTypes.types.ARRAY);


        while(tasks.hasNext()){
            Task b=tasks.next();

            if (b.getStartTime().isAfter(start) && b.getEndTime().isBefore(end)) {
                //System.out.println(data[i].title +" "+ data[i].start + " to " + data[i].end + " every " + " hours ");
                a.add(b);
            }
        }
        /*else if(data[i].repetitive==false) {
            if (data[i].time.isAfter(from) && data[i].time.isBefore(to)) {
                //System.out.println(data[i].title + " at " +data[i].time);
                at.add(data[i]);
            }
        }*/
     return a.iterator();
    }
}
