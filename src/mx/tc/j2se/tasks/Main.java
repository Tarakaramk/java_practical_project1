package mx.tc.j2se.tasks;

import java.sql.Types;

public  class Main {
    public static void main(String args[]){
        /*Task obj = new Task();
        obj.setTitle("walking");
        obj.setTime(9);
        obj.setTime(7,22,2);*/


        //object creation for task and passing arguments for constructor
        Task t = new Task("walking",9);


        //object creation for task and passing arguments for constructor
        Task t1 = new Task("Running",7,22,1);

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
        tsk.ArrayTaskListincoming(6,23);

        //acknowledging remove function(true or false)
        System.out.println(tsk.remove(1));

        //printing size after removing an task object from arraylist
        System.out.println("ArrayList :After removing SIZE:"+tsk.size());

        //calling arraytasklistincoming function after calling removing function
        tsk.ArrayTaskListincoming(6,23);


        /*t1.toString();
        tsk.display();*/

       /*

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
        System.out.println("LinkedList :After removing SIZE:"+lt.size());*/


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



        AbstractTaskList ab1 =ts.createTaskList(ListTypes.types.LINKED);
        ab1.add(t);
        ab1.add(t1);
        System.out.println("Get method:"+ab1.get(1));
        System.out.println("ArrayList :before removing SIZE:"+ab1.size());
        ab1.display();
        System.out.println(ab1.remove(1));
        System.out.println("ArrayList :After removing SIZE:"+ab1.size());



    }
}

