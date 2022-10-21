package mx.tc.j2se.tasks;
import java.util.Arrays;

public class ArrayTaskList<task> {
    private static final int INITIAL = 10;
    private int size = 0;
    private Task data[] = {};

    public ArrayTaskList() {
        data = new Task[INITIAL];
    }

    public void add(Task task) {
        if (size == data.length) {
            ensureCapacity();
        }
        data[size++] = task;
    }

    public Task get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (Task) data[index];
    }

    private void ensureCapacity() {
        int newIncreasedCapacity = data.length * 2;
        data = Arrays.copyOf(data, newIncreasedCapacity);
    }

    public Task remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        Task removedElement = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;

        return removedElement;
    }

    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
    }
        void ArrayTaskListincoming(int from,int to){
           display();
        }
}


