package mx.tc.j2se.tasks;
import java.util.Iterator;
import java.util.Spliterator;

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
            public Task next() {
                return get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
    @Override
    public boolean equals(Object o) {
        {
            AbstractTaskList ol = (AbstractTaskList) o;
            if (this.size() == 0 && ol.size() == 0) {
                return true;
            } else if (this.size() == ol.size()) {
                {
                    Iterator<Task> l = this.iterator();
                    Iterator<Task> l2 = ol.iterator();
                    while (l.hasNext()) {
                        Object o1 = l.next();
                        Object o2 = l2.next();
                        if (!(o1 == null ? o2 == null : o1.equals(o2))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
