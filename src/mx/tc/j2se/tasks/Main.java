package mx.tc.j2se.tasks;

//import java.sql.Types;
import com.sun.org.apache.xpath.internal.axes.IteratorPool;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Iterator;
import java.util.stream.Stream;

public  class Main {
    public static void main(String[] args){
        /*Task obj = new Task();
        obj.setTitle("walking");
        obj.setTime(9);
        obj.setTime(7,22,2);*/


        //object creation for task and passing arguments for constructor
        Task t = new Task("Running", LocalDateTime.of(2022, Month.valueOf("JUNE"),1,9,0));


        //object creation for task and passing arguments for constructor
        //Task t1 = new Task(,9);
        Task t1=new Task("walking",LocalDateTime.of(2022, Month.valueOf("OCTOBER"),30,9,0),
                          LocalDateTime.of(2022, Month.valueOf("DECEMBER"),
                        30,9,0), LocalTime.of(12,00));


        System.out.println(t1.nextTimeAfter(LocalDateTime.of(2022, Month.valueOf("AUGUST"),12,8,15)));


        //object creation for arraylist
        ArrayTaskList tsk= new ArrayTaskList();



       //adding task objects to arraylist
        tsk.add(t);
        tsk.add(t1);



       //printing get method return
        System.out.println("Get method:"+tsk.get(1));

        //printing size
        System.out.println("ArrayList :before removing SIZE:"+tsk.size());

        //calling arraytasklistincoming function
        tsk.ArrayTaskListincoming(LocalDateTime.of(2022, Month.valueOf("MAY"),
                30,6,0), LocalDateTime.of(2022, Month.valueOf("DECEMBER"),
                30,6,0));

        //acknowledging remove function(true or false)
        System.out.println(tsk.remove(1));

        //printing size after removing an task object from arraylist
        System.out.println("ArrayList :After removing SIZE:"+tsk.size());

        //calling arraytasklistincoming function after calling removing function
        tsk.ArrayTaskListincoming(LocalDateTime.of(2022, Month.valueOf("MAY"),
                30,6,0), LocalDateTime.of(2022, Month.valueOf("DECEMBER"),
                30,6,0));




        /*t1.toString();
        tsk.display();*/


        //object creation for linkedlist
       LinkedTaskList lt = new LinkedTaskList();

         //adding task objects to linkedlist
         lt.add(t);

         //inserting task objects at particular position in linkedlist
         lt.insertAt(1,t1);

         //printing linked list size
        System.out.println("Linkedlist :before removing SIZE:"+lt.size());

        //acknowledging remove function(true or false)
        System.out.println(lt.remove(1));

        //printing size after removing an task object from arraylist
        System.out.println("LinkedList :After removing SIZE:"+lt.size());

        /*lt.incoming(LocalDateTime.of(2022, Month.valueOf("MAY"),
                30,9,0),LocalDateTime.of(2022, Month.valueOf("DECEMBER"),
                30,9,0));
*/
        //lt.display();


        TaskListFactory ts= new TaskListFactory();
        AbstractTaskList ab =ts.createTaskList(ListTypes.types.ARRAY);
        ab.add(t);
        ab.add(t1);
        System.out.println("Get method:"+ab.get(1));
        System.out.println("ArrayList :before removing SIZE:"+ab.size());
        ab.display();
        System.out.println(ab.remove(1));
        System.out.println("ArrayList :After removing SIZE:"+ab.size());


        tsk.getStream().forEach(n-> System.out.println("Streams:"+n));





        AbstractTaskList ab1 =ts.createTaskList(ListTypes.types.LINKED);
        ab1.add(t);
        ab1.add(t1);
        System.out.println("Get method:"+ab1.get(1));
        System.out.println("ArrayList :before removing SIZE:"+ab1.size());
        ab1.display();
        System.out.println(ab1.remove(1));
        System.out.println("ArrayList :After removing SIZE:"+ab1.size());


        //System.out.println("clone:"+ab1.clone());*/


      //<task> implements Iterable<Task> and equals
        Iterator<Task> it = ab.iterator();
        while(it.hasNext()){
            String value = it.next().toString();
            System.out.print(value + ", ");
        }
        System.out.println(ab1.equals(tsk));


       //incoming method implementation in tasks method
        Tasks tas = new Tasks();

        Iterator<Task> tasks =tsk.iterator();
        tas.incoming(tasks,LocalDateTime.of(2022, Month.valueOf("MAY"),
                30,6,0),LocalDateTime.of(2022, Month.valueOf("DECEMBER"),
                30,6,0));


       //hashcode
        AbstractTaskList abs = new ArrayTaskList();
        abs.add(t);
        AbstractTaskList abs1 = new ArrayTaskList();
        abs1.add(t1);
        boolean hash = AbstractTaskList.hashcode(abs,abs1);
        System.out.println("HashCode:"+hash);





    }
}

