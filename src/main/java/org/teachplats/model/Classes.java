package org.teachplats.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Classes {
    @JsonProperty
    private Long id;
    @JsonProperty
    private String description;
    @JsonProperty("date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDate clasDate;
   //@JsonProperty("remote_present_id")
    private RemotePresent remotePresent = new RemotePresent();
    //@JsonProperty("course_id")
    private Course course=new Course();
    private List<File> fileList;

    public Classes() {
    }

    public Classes(String description, LocalDate clasDate, Long remotePresentId, Long courseId) {
        this.description = description;
        this.clasDate = clasDate;
        this.remotePresent.setId(remotePresentId);
        this.course.setId(courseId);
        this.fileList = new ArrayList<>();
    }
    public Classes(Long id, String description, LocalDate clasDate, Long remotePresentId, Long courseId) {
        this.id = id;
        this.description = description;
        this.clasDate = clasDate;
        this.remotePresent.setId(remotePresentId);
        this.course.setId(courseId);
        this.fileList = new ArrayList<>();
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

    public LocalDate getClasDate() {
        return clasDate;
    }

    public void setClasDate(LocalDate clasDate) {
        this.clasDate = clasDate;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Classes{");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", clasDate=").append(clasDate);
        sb.append(", remotePresent=").append(remotePresent);
        sb.append(", course=").append(course);
        sb.append('}');
        return sb.toString();
    }
}
