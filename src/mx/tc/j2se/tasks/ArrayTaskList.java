package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

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
        void ArrayTaskListincoming(LocalDateTime from, LocalDateTime to){
        ArrayTaskList at = new ArrayTaskList();
        for(int i=0;i<siz;i++) {
            if(data[i].repetitive == true) {
                if (data[i].start.isAfter(from) && data[i].end.isBefore(to)) {
                    //System.out.println(data[i].title +" "+ data[i].start + " to " + data[i].end + " every " + " hours ");
                    at.add(data[i]);
                }
            }
            else if(data[i].repetitive==false){
                if (data[i].time.isAfter(from) && data[i].time.isBefore(to)) {
                    //System.out.println(data[i].title + " at " +data[i].time);
                    at.add(data[i]);
                }
            }
        }
        }

    //@Override
     public Stream<Task> getStream(){
        return Stream.of(data);

    }

    @Override
    public String toString() {
        return "ArrayTaskList{" +
                "siz=" + siz +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}



