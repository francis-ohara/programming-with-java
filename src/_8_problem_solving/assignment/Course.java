package _8_problem_solving.assignment;

import java.util.Date;

public class Course {
    private String name;
    private String description;
    private String courseCode;
    private Date startDate;
    private String lecturer;

    public Course(String name, String description, String courseCode, Date startDate, String lecturer) {
        this.name = name;
        this.description = description;
        this.courseCode = courseCode;
        this.startDate = startDate;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}
