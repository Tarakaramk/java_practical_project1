package mx.tc.j2se.tasks;
import java.util.Iterator;
public abstract class AbstractTaskList<task>implements Iterable<Task> {
    public abstract void add(Task task);

    public abstract boolean remove(int index);
    public abstract int size();
    public abstract void display();
    public abstract Task get(int index);


    public Iterator<Task> iterator() {
        Iterator<Task> it = new Iterator<Task>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size() && get(currentIndex) != null;
            }
            @Override
            public Task next(){
                return get(currentIndex++);
            }
            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

}
