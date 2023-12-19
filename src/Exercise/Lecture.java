// Created by YapWH On 14/12/2023 10:20 AM

package Exercise;

public class Lecture extends Course{
    private int duration;


    public Lecture(int numLecture, String courseTitle, int numCredits, int duration){
        super();
        setNumLecture(numLecture);
        setCourseTitle(courseTitle);
        this.duration = duration;
        setNumCredits(numCredits);
    }


    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public String getType() {
        return "Lecture";
    }
    @Override
    public String getDetails() {
        return "Duration: " + duration;
    }
    @Override
    public String toString(){
        return getType() + " - " + getNumLecture() + " - " + getCourseTitle() + " - " + getNumCredits() + " credits\n" + getDetails();
    }
}
