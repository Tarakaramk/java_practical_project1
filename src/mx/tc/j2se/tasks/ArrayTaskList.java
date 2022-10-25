package mx.tc.j2se.tasks;
import java.util.Arrays;

public class ArrayTaskList<task> extends AbstractTaskList{
    private static final int INITIAL = 10;
    private int siz = 0;
    private Task data[] = {};

    public ArrayTaskList() {
        data = new Task[INITIAL];
    }

    public void add(Task task) {
        if (siz == data.length) {
            ensureCapacity();
        }
        data[siz++] = task;
    }

    public Task get(int index) {
        if (index < 0 || index >= siz) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (Task) data[index];
    }

    private void ensureCapacity() {
        int newIncreasedCapacity = data.length * 2;
        data = Arrays.copyOf(data, newIncreasedCapacity);
    }

    public boolean remove(int index) {
        if (index < 0 || index >= siz) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        Task removedElement = data[index];
        for (int i = index; i < siz - 1; i++) {
            data[i] = data[i + 1];
        }
        siz--;
        return true;
    }
    public int size(){
        return siz;
    }

    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < siz; i++) {
            System.out.print(data[i] + " ");
        }
    }
        void ArrayTaskListincoming(int from,int to){
        for(int i=from+1;i<to;i++){

        }
        }
}


