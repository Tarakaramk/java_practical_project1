package mx.tc.j2se.tasks;

public  class Main {
    public static void main(String args[]){
        //Task obj = new Task();
        //obj.setTitle("walking");
        //obj.setTime(9);
        //obj.setTime(7,22,2);

        Task t = new Task("walking",9);

        Task t1 = new Task("Running",7,22,2);
        //t1.toString();
        ArrayTaskList tsk= new ArrayTaskList();
        //tsk.display();
        tsk.add(t);
        tsk.add(t1);
        System.out.println("Get method:"+tsk.get(1));
        System.out.println("ArrayList :before removing SIZE:"+tsk.size());
        tsk.display();
        System.out.println(tsk.remove(1));
        System.out.println("ArrayList :After removing SIZE:"+tsk.size());
        LinkedTaskList lt = new LinkedTaskList();
         lt.add(t);
         lt.insertAt(1,t1);
        System.out.println("Linkedlist :before removing SIZE:"+lt.size());
        lt.display();
        System.out.println(lt.remove(1));
        System.out.println("LinkedList :After removing SIZE:"+lt.size());



    }
}

