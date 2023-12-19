// Created by YapWH On 14/12/2023 10:13 AM

package Exercise;

public abstract class Course {
    private int numLecture;
    private String courseTitle;
    private int numCredits;


    protected Course(int numLecture, String courseTitle, int numCredits){
        this.courseTitle = courseTitle;
        this.numLecture = numLecture;
        this.numCredits = numCredits;
    }
    public Course() {

    }


    public int getNumLecture() {
        return numLecture;
    }
    public void setNumLecture(int numLecture) {
        this.numLecture = numLecture;
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public int getNumCredits() {
        return numCredits;
    }
    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }


    public abstract String getType();
    public abstract String getDetails();
    @Override
    public String toString(){
        return getType() + " - " + numLecture + " - " + courseTitle + " - " + numCredits + " credits\n" + getDetails();
    }
}

