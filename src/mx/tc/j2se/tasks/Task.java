package mx.tc.j2se.tasks;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {
    String title;

    LocalDateTime time;
    LocalDateTime start;
    LocalDateTime end;
    LocalDateTime current;
    LocalTime interval;
    LocalTime RepeatInterval;
    int rflag;
    int aflag;
    boolean repetitive;
    boolean active = false;

    Task() {
    }

    //equals


    boolean isRepeated() {
        if (rflag == 0) {
            repetitive = true;
            return true;
        } else {
            repetitive = false;
            return false;
        }
    }

    boolean isActive() {
        if (aflag == 0) {
            active = true;
            return true;
        } else {
            active = false;
            return false;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        if (repetitive) {
            start = start.plusHours(this.interval.getHour());
            return start;
        }
        return start;
    }


    public void setTime(LocalDateTime time) {
        this.time = time;
        if (repetitive)
            repetitive = false;
    }

    public LocalDateTime getStartTime() {
        if (repetitive = false)
            return start;
        else return this.time;
    }

    public LocalDateTime getEndTime() {
        if (repetitive = false)
            return end;
        else
        return this.time;
    }

    public LocalTime getRepeatInterval() {
        if (repetitive = false)
            return LocalTime.of(0,0,0);
        return this.interval;
    }

    public Task(String title, LocalDateTime start, LocalDateTime end, LocalTime interval){
        if(start.getHour()<0 || end.getHour()<0)
        {
            throw new IllegalArgumentException("time must be greater than zero");
        }
        repetitive=true;
        rflag = 0;
        aflag = 0;
        this.title = title;
        this.start = start;
        this.end = end;
        this.interval = interval;
        if (this.interval.getHour() < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
    }

    public Task(String title,LocalDateTime time)  {
        repetitive=false;
        rflag = 1;
        aflag = 0;
        this.title = title;
        this.time = time;
        if (time.getHour() < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
    }

    public void setTime(LocalDateTime start, LocalDateTime end, LocalTime interval) {
        if (repetitive == false)
            repetitive = true;
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    public LocalDateTime nextTimeAfter(LocalDateTime current) {
        this.current = current;
        current = start.plusHours(this.interval.getHour());
        if (current.isAfter(end))
             return LocalDateTime.of(-1,-1,-1,-1,-1,-1);
        return current;

    }
    void setActive(boolean active) {
        active = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", time=" + time +
                ", start=" + start +
                ", end=" + end +
                ", interval=" + interval +
                ", RepeatInterval=" + RepeatInterval +
                ", current=" + current +
                ", rflag=" + rflag +
                ", aflag=" + aflag +
                ", repetitive=" + repetitive +
                ", active=" + active +
                '}';
    }
}

