package org.teachplats.model;

import java.util.Date;

public class Classes {

    private Long id;
    private String description;
    private Date clasDate;
    private Long remotePresentId;
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
