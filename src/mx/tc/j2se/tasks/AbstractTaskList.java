package mx.tc.j2se.tasks;

public abstract class AbstractTaskList {
    public abstract void add(Task task);

    public abstract boolean remove(int index);
    public abstract int size();
    public abstract void display();
    public abstract Task get(int index);



}
