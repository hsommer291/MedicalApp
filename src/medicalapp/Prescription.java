package lehigh.brown.pkgbyte;
/*
 * @author Jonathan Blum
 * CSE 216 - prescription class 
 */

import java.sql.Time;

public class Prescription {

    private Time start_time;
    private Time end_time; 
    
    public Prescription(Time start, Time end) {
        this.start_time = start;
        this. end_time = end;
    }

    public Time getStartTime() {
        return start_time;
    }

    public void setStartTime(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEndTime() {
        return end_time;
    }

    public void setEndTime(Time end_time) {
        this.end_time = end_time;
    }
    
    
}
