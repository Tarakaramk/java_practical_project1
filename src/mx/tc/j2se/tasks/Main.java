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
        ArrayTaskList<Task> tsk= new ArrayTaskList<Task>();
        //tsk.display();
        tsk.add(t);
        tsk.add(t1);
        //tsk.get(5);
        tsk.display();
        tsk.remove(1);
    }
}

