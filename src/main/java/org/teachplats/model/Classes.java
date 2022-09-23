package org.teachplats.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Classes {

    private Long id;
    private String description;
    private Date classDate;
    private RemotePresent remotePresent;
    private Course course;
    private List<File> listFiles;

    public Classes() {
    }


    public Classes(String description, Date classDate, RemotePresent remotePresent, Course course) {
        this.description = description;
        this.classDate = classDate;
        this.remotePresent = remotePresent;
        this.course = course;
        this.listFiles = new ArrayList<>();
    }

    public Classes(Long id, String description, Date classDate, RemotePresent remotePresent, Course course) {
        this.id = id;
        this.description = description;
        this.classDate = classDate;
        this.remotePresent = remotePresent;
        this.course = course;
        this.listFiles = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getClassDate() {
        return classDate;
    }

    public void setClassDate(Date classDate) {
        this.classDate = classDate;
    }

    public RemotePresent getRemotePresent() {
        return remotePresent;
    }

    public void setRemotePresent(RemotePresent remotePresent) {
        this.remotePresent = remotePresent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<File> getListFiles() {
        return listFiles;
    }

    public void setListFiles(List<File> listFiles) {
        this.listFiles = listFiles;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", classDate=" + classDate +
                ", remotePresent=" + remotePresent +
                ", course=" + course +
                ", listFiles=" + listFiles +
                '}';
    }
}
