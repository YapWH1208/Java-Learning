package Lecture_12;

import java.util.GregorianCalendar;
import java.util.Timer;

public class Stopwatch {
    double startTime;
    double endTime;

    public double getStartTime() {
        return startTime;
    }
    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }
    public double getEndTime() {
        return endTime;
    }
    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    Stopwatch(){
        this.startTime = System.currentTimeMillis();
    }

    void start(){
        this.startTime = System.currentTimeMillis();
    }
    void stop(){
        this.endTime = System.currentTimeMillis();
    }
    void getElapsedTime(){
        double totalSec = (this.endTime - this.startTime) / 1000;
        double second = totalSec % 60;
        double totalMin = totalSec / 60;
        double minute = totalMin % 60;
        double totalHour = totalMin / 60;
        System.out.printf("%.0f:%.0f:%.0f",totalHour,minute,second);
    }
}
