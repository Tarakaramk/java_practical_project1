package mx.tc.j2se.tasks;

public class Task {
    String title;

    int time,start,end,interval,RepeatInterval,current,rflag,aflag;
    boolean repetitive;
    boolean active=false;
    Task(){};

    boolean isRepeated(){
        if(rflag==0) {
            repetitive = true;
            return true;
        }
        else {
            repetitive=false;
            return false;
        }
    }
    boolean isActive(){
        if(aflag==0) {
            active = true;
            return true;
        }
        else {
            active=false;
            return false;
        }
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

      public int getTime () {
        if(repetitive) {
            start = start + interval;
            return start;
        }
          return 0;

      }


    public void setTime(int time) {
        this.time = time;
        if(repetitive)
            repetitive=false;
    }

    public int getStartTime() {
        if(repetitive=false)
            return start;
        return 0;
    }

    public int getEndTime() {
        if(repetitive=false)
            return end;
        return 0;
    }

    public int getRepeatInterval() {
        if(repetitive=false)
            return 0;
        return 0;
    }

    public Task(String title, int start, int end, int interval) {
        rflag=0;
        aflag=0;
        this.title = title;
        this.start = start;
        this.end = end;
        this.interval = interval;
        System.out.println(title+" from "+start+" to "+end);

    }

    public Task(String title, int time) {
        rflag=1;
        aflag=0;
        this.title = title;
        this.time = time;
        System.out.println(title+" at "+time);

    }
    void setTime(int start,int end, int interval){
      if(repetitive==false)
          repetitive=true;
      this.start=start;
      this.end=end;
      this.interval=interval;
    }
    int nextTimeAfter(int current){
        this.current=current;
        current=start+interval;
        if(current>end)
            return -1;
        return current;

    }

}
