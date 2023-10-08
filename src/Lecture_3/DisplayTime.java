package Lecture_3;

public class DisplayTime {
    public static void main(String[] args){
        long totalMillis = System.currentTimeMillis();
        long totalSec = totalMillis / 1000;
        long second = totalSec % 60;
        long totalMin = totalSec / 60;
        long minute = totalMin % 60;
        long totalHour = totalMin / 60;

        // Change to GMT format
        long GMT = totalHour % 24;
        // Change to time zone GMT+8
        long GMT_8 = GMT + 8;
        // Change from 24 hour format to 12 hour format
        long GMT_8_12hr = GMT_8 % 12;

        System.out.println(totalMillis);
        System.out.println("Current time: " + GMT_8_12hr + ":" + minute + ":" + second);
    }
}
