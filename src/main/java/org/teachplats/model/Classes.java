package org.teachplats.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Classes {
    @JsonProperty
    private Long id;
    @JsonProperty
    private String description;
    @JsonProperty("date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date clasDate;
    @JsonProperty("remote_present_id")
    private Long remotePresentId;
    @JsonProperty("course_id")
    private Long courseId;

    public Classes() {
    }

    public Classes(Long id, String description, Date clasDate, Long remotePresentId, Long courseId) {
        this.id = id;
        this.description = description;
        this.clasDate = clasDate;
        this.remotePresentId = remotePresentId;
        this.courseId = courseId;
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

    public Date getClasDate() {
        return clasDate;
    }

    public void setClasDate(Date clasDate) {
        this.clasDate = clasDate;
    }

    public Long getRemotePresentId() {
        return remotePresentId;
    }

    public void setRemotePresentId(Long remotePresentId) {
        this.remotePresentId = remotePresentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", clasDate=" + clasDate +
                ", remotePresentId=" + remotePresentId +
                ", courseId=" + courseId +
                '}';
    }
}
